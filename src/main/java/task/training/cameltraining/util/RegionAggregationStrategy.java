package task.training.cameltraining.util;

import org.apache.camel.AggregationStrategy;
import org.apache.camel.Exchange;
import org.springframework.stereotype.Component;
import task.training.cameltraining.entity.Country;
import task.training.cameltraining.entity.Region;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Component
public class RegionAggregationStrategy implements AggregationStrategy {

    public Exchange aggregate(Exchange oldExchange, Exchange newExchange) {
        Country country = newExchange.getIn().getBody(Country.class);
        if (oldExchange == null) {
            Region region = new Region();
            region.setName(country.getRegion());
            List<Country> countryList = new ArrayList<>();
            countryList.add(country);
            region.setCountryList(countryList);
            newExchange.getIn().setBody(region);
            return newExchange;
        }
        Region region = oldExchange.getIn().getBody(Region.class);
        region.getCountryList().add(country);
        return oldExchange;

    }
}
