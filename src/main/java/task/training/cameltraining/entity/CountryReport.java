package task.training.cameltraining.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "countries")
public class CountryReport {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    @Column(name = "region")
    private String region;

    @Column(name = "country")
    private String country;

    @Column(name = "order_count")
    private int orderCount;

    @Column(name = "avg_units_sold")
    private BigDecimal averageUnitsSold;

    @Column(name = "avg_unit_price")
    private BigDecimal averageUnitPrice;

    @Column(name = "avg_unit_cost")
    private BigDecimal averageUnitCost;

    @Column(name = "totalRevenue")
    private BigDecimal totalRevenue;

    @Column(name = "totalCost")
    private BigDecimal totalCost;

    @Column(name = "totalProfit")
    private BigDecimal totalProfit;

    @Column(name = "csv_file_name")
    private String csvFileName;

    @Column(name = "processing_date")
    private Date processingDate;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getOrderCount() {
        return orderCount;
    }

    public void setOrderCount(int orderCount) {
        this.orderCount = orderCount;
    }

    public BigDecimal getAverageUnitsSold() {
        return averageUnitsSold;
    }

    public void setAverageUnitsSold(BigDecimal averageUnitsSold) {
        this.averageUnitsSold = averageUnitsSold;
    }

    public BigDecimal getAverageUnitPrice() {
        return averageUnitPrice;
    }

    public void setAverageUnitPrice(BigDecimal averageUnitPrice) {
        this.averageUnitPrice = averageUnitPrice;
    }

    public BigDecimal getAverageUnitCost() {
        return averageUnitCost;
    }

    public void setAverageUnitCost(BigDecimal averageUnitCost) {
        this.averageUnitCost = averageUnitCost;
    }

    public BigDecimal getTotalRevenue() {
        return totalRevenue;
    }

    public void setTotalRevenue(BigDecimal totalRevenue) {
        this.totalRevenue = totalRevenue;
    }

    public BigDecimal getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(BigDecimal totalCost) {
        this.totalCost = totalCost;
    }

    public BigDecimal getTotalProfit() {
        return totalProfit;
    }

    public void setTotalProfit(BigDecimal totalProfit) {
        this.totalProfit = totalProfit;
    }

    public String getCsvFileName() {
        return csvFileName;
    }

    public void setCsvFileName(String csvFileName) {
        this.csvFileName = csvFileName;
    }

    public Date getProcessingDate() {
        return processingDate;
    }

    public void setProcessingDate(Date processingDate) {
        this.processingDate = processingDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CountryReport that = (CountryReport) o;
        return id == that.id &&
                orderCount == that.orderCount &&
                Objects.equals(region, that.region) &&
                Objects.equals(country, that.country) &&
                Objects.equals(averageUnitsSold, that.averageUnitsSold) &&
                Objects.equals(averageUnitPrice, that.averageUnitPrice) &&
                Objects.equals(averageUnitCost, that.averageUnitCost) &&
                Objects.equals(totalRevenue, that.totalRevenue) &&
                Objects.equals(totalCost, that.totalCost) &&
                Objects.equals(totalProfit, that.totalProfit) &&
                Objects.equals(csvFileName, that.csvFileName) &&
                Objects.equals(processingDate, that.processingDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, region, country, orderCount, averageUnitsSold, averageUnitPrice, averageUnitCost, totalRevenue, totalCost, totalProfit, csvFileName, processingDate);
    }

    @Override
    public String toString() {
        return "CountryReport{" +
                "id=" + id +
                ", region='" + region + '\'' +
                ", country='" + country + '\'' +
                ", orderCount=" + orderCount +
                ", averageUnitsSold=" + averageUnitsSold +
                ", averageUnitPrice=" + averageUnitPrice +
                ", averageUnitCost=" + averageUnitCost +
                ", totalRevenue=" + totalRevenue +
                ", totalCost=" + totalCost +
                ", totalProfit=" + totalProfit +
                ", csvFileName='" + csvFileName + '\'' +
                ", processingDate=" + processingDate +
                '}';
    }
}
