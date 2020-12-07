package task.training.cameltraining.service;

import org.springframework.stereotype.Service;
import task.training.cameltraining.entity.Order;
import task.training.cameltraining.repository.OrderRepository;

@Service
public class OrderService {

    private final OrderRepository repository;

    public OrderService(OrderRepository repository) {
        this.repository = repository;
    }

    public void saveOrder(Order order) {
        repository.save(order);
    }

}
