package uz.isystem.Magazin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uz.isystem.Magazin.dto.BrandsDto;
import uz.isystem.Magazin.repository.BrandsRepository;

@Service
public class BrandsService {
    @Autowired
    private BrandsRepository brandsRepository;

    public BrandsDto create(BrandsDto brands) {
        return null;
    }

    public BrandsDto get(Integer id) {
        return null;
    }

    public boolean update(Integer id, BrandsDto brands) {
        return false;
    }

    public boolean delete(Integer id) {
        return false;
    }
}
