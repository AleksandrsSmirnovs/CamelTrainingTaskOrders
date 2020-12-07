package task.training.cameltraining.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;
import org.springframework.stereotype.Component;

@Component
@CsvRecord(separator = ",")
@Data
@NoArgsConstructor
public class RegionCsvRecord {

    @DataField(pos = 1)
    private String country;

    @DataField(pos = 2)
    private int orderCount;

    @DataField(pos = 3)
    private String averageUnitsSold;

    @DataField(pos = 4)
    private String averageUnitPrice;

    @DataField(pos = 5)
    private String averageUnitCost;

    @DataField(pos = 6)
    private String totalRevenueInMillions;

    @DataField(pos = 7)
    private String totalCostInMillions;

    @DataField(pos = 8)
    private String totalProfitInMillions;



}
