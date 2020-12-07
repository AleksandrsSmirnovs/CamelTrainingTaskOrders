package task.training.cameltraining.util;

import org.springframework.stereotype.Component;
import task.training.cameltraining.entity.Order;
import task.training.cameltraining.entity.enums.OrderPriority;
import task.training.cameltraining.model.OrderCsvRecord;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;

@Component
public class CsvRecordToOrder {

    private final SimpleDateFormat dateFormat = new SimpleDateFormat("d/M/yyyy");

    public Order convert(OrderCsvRecord csvRecord) throws ParseException {
        Order order = new Order();
        order.setOrderId(csvRecord.getOrderId());
        order.setOrderDate(dateFormat.parse(csvRecord.getOrderDate()));
        order.setOrderPriority(OrderPriority.valueOf(String.valueOf(csvRecord.getOrderPriority())));
        order.setShippingDate(dateFormat.parse(csvRecord.getShipDate()));
        order.setCost(new BigDecimal(csvRecord.getTotalCost()));
        order.setRevenue(new BigDecimal(csvRecord.getTotalRevenue()));
        order.setProfit(new BigDecimal(csvRecord.getTotalProfit()));
        order.setItemType(csvRecord.getItemType());
        order.setCountry(csvRecord.getCountry());
        order.setRegion(csvRecord.getRegion());
        order.setUnitsSold(csvRecord.getUnitsSold());
        order.setUnitPrice(new BigDecimal(csvRecord.getUnitPrice()));
        order.setUnitCost(new BigDecimal(csvRecord.getUnitCost()));
        return order;
    }


}
