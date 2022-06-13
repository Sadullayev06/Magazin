package uz.isystem.Magazin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uz.isystem.Magazin.dto.MerchantsDto;
import uz.isystem.Magazin.repository.MerchantsRepository;

@Service
public class MerchantsService {
    @Autowired
    private MerchantsRepository merchantsRepository;

    public MerchantsDto create(MerchantsDto merchants) {
        return null;
    }

    public MerchantsDto get(Integer id) {
        return null;
    }

    public boolean update(Integer id, MerchantsDto merchants) {
        return false;
    }

    public boolean delete(Integer id) {
        return false;
    }
}
