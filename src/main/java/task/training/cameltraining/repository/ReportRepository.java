package task.training.cameltraining.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import task.training.cameltraining.entity.CountryReport;
import task.training.cameltraining.entity.Region;

@Repository
public interface ReportRepository extends CrudRepository<CountryReport, Long> {
}
