package uz.isystem.Magazin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uz.isystem.Magazin.dto.BodyTypesDto;
import uz.isystem.Magazin.repository.BodyTypesRepository;

@Service
public class BodyTypesService {
    @Autowired
    private BodyTypesRepository bodyTypesRepository;
    
    public BodyTypesDto create(BodyTypesDto bodyTypes) {
        return null;
    }

    public BodyTypesDto get(Integer id) {
        return null;
    }

    public boolean update(Integer id, BodyTypesDto bodyTypes) {
        return false;
    }

    public boolean delete(Integer id) {
        return false;
    }
}
