package uz.isystem.Magazin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.isystem.Magazin.model.Brands;

public interface BrandsRepository extends JpaRepository<Brands,Integer> {
}
