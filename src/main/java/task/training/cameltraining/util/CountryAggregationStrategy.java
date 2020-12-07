package task.training.cameltraining.util;

import org.apache.camel.AggregationStrategy;
import org.apache.camel.Exchange;
import org.springframework.stereotype.Component;
import task.training.cameltraining.entity.Country;
import task.training.cameltraining.entity.Order;

import java.math.BigDecimal;
import java.math.RoundingMode;

@Component
public class CountryAggregationStrategy implements AggregationStrategy {

    public Exchange aggregate(Exchange oldExchange, Exchange newExchange) {
        Order order = newExchange.getIn().getBody(Order.class);
        if (oldExchange == null) {
            Country country = new Country();
            country.setCountryName(order.getCountry());
            country.setRegion(order.getRegion());
            country.setOrderCount(1);
            country.setAverageUnitsSold(BigDecimal.valueOf(order.getUnitsSold()));
            country.setAverageUnitPrice(order.getUnitPrice());
            country.setAverageUnitCost(order.getUnitCost());
            country.setTotalRevenueInMillions(order.getRevenue()
                    .divide(BigDecimal.valueOf(1000000), 3, RoundingMode.HALF_EVEN)
                    .setScale(6, RoundingMode.HALF_EVEN));
            country.setTotalCostInMillions(order.getCost()
                    .divide(BigDecimal.valueOf(1000000), 3, RoundingMode.HALF_EVEN)
                    .setScale(6, RoundingMode.HALF_EVEN));
            country.setTotalProfitInMillions(order.getProfit()
                    .divide(BigDecimal.valueOf(1000000), 3, RoundingMode.HALF_EVEN)
                    .setScale(6, RoundingMode.HALF_EVEN));
            newExchange.getIn().setBody(country);
            return newExchange;
        }
        Country country = oldExchange.getIn().getBody(Country.class);
        country.updateAverageUnitCost(order);
        country.updateAverageUnitPrice(order);
        country.updateAverageUnitsSold(order);
        country.addTotalCostInMillions(order);
        country.addTotalRevenueInMillions(order);
        country.addTotalProfitInMillions(order);
        country.addOrderCount();
        return oldExchange;
    }
}
