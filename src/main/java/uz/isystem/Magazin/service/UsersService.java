package uz.isystem.Magazin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uz.isystem.Magazin.dto.UsersDto;
import uz.isystem.Magazin.repository.UsersRepository;

@Service
public class UsersService {
    @Autowired
    private UsersRepository usersRepository;

    public UsersDto create(UsersDto users) {
        return null;
    }

    public UsersDto get(Integer id) {
        return null;
    }

    public boolean update(Integer id, UsersDto users) {
        return false;
    }

    public boolean delete(Integer id) {
        return false;
    }
}
