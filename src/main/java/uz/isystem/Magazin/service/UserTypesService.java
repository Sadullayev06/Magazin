package uz.isystem.Magazin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uz.isystem.Magazin.dto.UserTypesDto;
import uz.isystem.Magazin.repository.UserTypesRepository;

@Service
public class UserTypesService {
    @Autowired
    private UserTypesRepository userTypesRepository;

    public UserTypesDto create(UserTypesDto userTypes) {
        return null;
    }

    public UserTypesDto get(Integer id) {
        return null;
    }

    public boolean update(Integer id, UserTypesDto userTypes) {
        return false;
    }

    public boolean delete(Integer id) {
        return false;
    }
}
