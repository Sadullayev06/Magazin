package uz.isystem.Magazin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.isystem.Magazin.model.Merchants;

public interface MerchantsRepository extends JpaRepository<Merchants,Integer> {
}
