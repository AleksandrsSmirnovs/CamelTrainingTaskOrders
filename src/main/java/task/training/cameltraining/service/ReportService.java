package task.training.cameltraining.service;

import org.springframework.stereotype.Service;
import task.training.cameltraining.entity.CountryReport;
import task.training.cameltraining.repository.ReportRepository;

@Service
public class ReportService {

    private final ReportRepository repository;

    public ReportService(ReportRepository repository) {
        this.repository = repository;
    }

    public void saveReport(CountryReport report) {
        repository.save(report);
    }
}
