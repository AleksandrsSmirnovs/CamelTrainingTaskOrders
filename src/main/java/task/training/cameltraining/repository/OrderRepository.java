package task.training.cameltraining.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import task.training.cameltraining.entity.Order;

@Repository
public interface OrderRepository extends CrudRepository<Order, Long> {
}
