package uz.isystem.Magazin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.isystem.Magazin.model.Vehicles;

public interface VehiclesRepository extends JpaRepository<Vehicles,Integer> {
}
