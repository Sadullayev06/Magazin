package uz.isystem.Magazin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.isystem.Magazin.model.Applications;

public interface ApplicationsRepository extends JpaRepository<Applications,Integer> {
}
