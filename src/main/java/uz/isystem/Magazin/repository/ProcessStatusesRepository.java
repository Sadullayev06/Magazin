package uz.isystem.Magazin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.isystem.Magazin.model.ProcessStatuses;

import javax.persistence.criteria.CriteriaBuilder;

public interface ProcessStatusesRepository extends JpaRepository<ProcessStatuses, Integer> {
}
