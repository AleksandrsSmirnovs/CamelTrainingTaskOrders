package task.training.cameltraining.util;

import org.springframework.stereotype.Component;
import task.training.cameltraining.entity.Country;
import task.training.cameltraining.entity.CountryReport;

import java.util.Date;

@Component
public class CountryToReport {

    public CountryReport convert(Country country) {
        CountryReport report = new CountryReport();
        report.setRegion(country.getRegion());
        report.setCountry(country.getCountryName());
        report.setOrderCount(country.getOrderCount());
        report.setAverageUnitsSold(country.getAverageUnitsSold());
        report.setAverageUnitPrice(country.getAverageUnitPrice());
        report.setAverageUnitCost(country.getAverageUnitCost());
        report.setTotalRevenue(country.getTotalRevenueInMillions());
        report.setTotalCost(country.getTotalCostInMillions());
        report.setTotalProfit(country.getTotalProfitInMillions());
        report.setCsvFileName(country.getRegion() + "_" + new Date());
        report.setProcessingDate(new Date());
        return report;
    }
}
