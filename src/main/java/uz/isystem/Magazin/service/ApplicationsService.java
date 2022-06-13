package uz.isystem.Magazin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uz.isystem.Magazin.dto.ApplicationsDto;
import uz.isystem.Magazin.repository.ApplicationsRepository;

@Service
public class ApplicationsService {
    @Autowired
    private ApplicationsRepository applicationsRepository;

    public ApplicationsDto create(ApplicationsDto applications) {
        return null;
    }

    public ApplicationsDto get(Integer id) {
        return null;
    }

    public boolean update(Integer id, ApplicationsDto applications) {
        return false;
    }

    public boolean delete(Integer id) {
        return false;
    }
}
