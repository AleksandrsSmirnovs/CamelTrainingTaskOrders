package task.training.cameltraining.model;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;
import org.springframework.stereotype.Component;

@Component
@CsvRecord(separator = ",")
@Data
@NoArgsConstructor
public class OrderCsvRecord {

    @DataField(pos = 1, trim = true)
    private String region;

    @DataField(pos = 2, trim = true)
    private String country;

    @DataField(pos = 3, trim = true)
    private String itemType;

    @DataField(pos = 4, trim = true)
    private String salesChannel;

    @DataField(pos = 5, trim = true)
    private char orderPriority;

    @DataField(pos = 6, trim = true)
    private String orderDate;

    @DataField(pos = 7, trim = true)
    private long orderId;

    @DataField(pos = 8, trim = true)
    private String shipDate;

    @DataField(pos = 9, trim = true)
    private int unitsSold;

    @DataField(pos = 10, trim = true)
    private String unitPrice;

    @DataField(pos = 11, trim = true)
    private String unitCost;

    @DataField(pos = 12, trim = true)
    private String totalRevenue;

    @DataField(pos = 13, trim = true)
    private String totalCost;

    @DataField(pos = 14, trim = true)
    private String totalProfit;

    public String getRegion() {
        return region;
    }

    public String getCountry() {
        return country;
    }

    public String getItemType() {
        return itemType;
    }

    public String getSalesChannel() {
        return salesChannel;
    }

    public char getOrderPriority() {
        return orderPriority;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public long getOrderId() {
        return orderId;
    }

    public String getShipDate() {
        return shipDate;
    }

    public int getUnitsSold() {
        return unitsSold;
    }

    public String getUnitPrice() {
        return unitPrice;
    }

    public String getUnitCost() {
        return unitCost;
    }

    public String getTotalRevenue() {
        return totalRevenue;
    }

    public String getTotalCost() {
        return totalCost;
    }

    public String getTotalProfit() {
        return totalProfit;
    }
}
