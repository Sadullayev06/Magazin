package uz.isystem.Magazin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.isystem.Magazin.model.Users;

public interface UsersRepository extends JpaRepository<Users,Integer> {
}
