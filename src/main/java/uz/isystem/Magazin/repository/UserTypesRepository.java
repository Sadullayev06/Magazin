package uz.isystem.Magazin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.isystem.Magazin.model.UserTypes;

public interface UserTypesRepository extends JpaRepository<UserTypes,Integer> {
}
