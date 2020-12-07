package task.training.cameltraining.entity;

import lombok.Builder;
import task.training.cameltraining.entity.enums.OrderPriority;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "order_id")
    private long orderId;

    @Column(name = "order_date")
    private Date orderDate;

    @Column(name = "order_priority", columnDefinition = "enum('H','C','L','M')")
    @Enumerated(EnumType.STRING)
    private OrderPriority orderPriority;

    @Column(name = "shipping_date")
    private Date shippingDate;

    @Column(name = "cost")
    private BigDecimal cost;

    @Column(name = "revenue")
    private BigDecimal revenue;

    @Column(name = "profit")
    private BigDecimal profit;

    @Column(name = "item_type")
    private String itemType;

    @Column(name = "country")
    private String country;

    @Transient
    private String region;

    @Transient
    private int unitsSold;

    @Transient
    private BigDecimal unitPrice;

    @Transient
    private BigDecimal unitCost;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public OrderPriority getOrderPriority() {
        return orderPriority;
    }

    public void setOrderPriority(OrderPriority orderPriority) {
        this.orderPriority = orderPriority;
    }

    public Date getShippingDate() {
        return shippingDate;
    }

    public void setShippingDate(Date shippingDate) {
        this.shippingDate = shippingDate;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public BigDecimal getRevenue() {
        return revenue;
    }

    public void setRevenue(BigDecimal revenue) {
        this.revenue = revenue;
    }

    public BigDecimal getProfit() {
        return profit;
    }

    public void setProfit(BigDecimal profit) {
        this.profit = profit;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public int getUnitsSold() {
        return unitsSold;
    }

    public void setUnitsSold(int unitsSold) {
        this.unitsSold = unitsSold;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return id == order.id &&
                orderId == order.orderId &&
                Objects.equals(orderDate, order.orderDate) &&
                orderPriority == order.orderPriority &&
                Objects.equals(shippingDate, order.shippingDate) &&
                Objects.equals(cost, order.cost) &&
                Objects.equals(revenue, order.revenue) &&
                Objects.equals(profit, order.profit) &&
                Objects.equals(itemType, order.itemType) &&
                Objects.equals(country, order.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, orderId, orderDate, orderPriority, shippingDate, cost, revenue, profit, itemType, country);
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", orderId=" + orderId +
                ", orderDate=" + orderDate +
                ", orderPriority=" + orderPriority +
                ", shippingDate=" + shippingDate +
                ", cost=" + cost +
                ", revenue=" + revenue +
                ", profit=" + profit +
                ", itemType='" + itemType + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public BigDecimal getUnitCost() {
        return unitCost;
    }

    public void setUnitCost(BigDecimal unitCost) {
        this.unitCost = unitCost;
    }
}
