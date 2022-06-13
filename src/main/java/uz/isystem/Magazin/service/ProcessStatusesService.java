package uz.isystem.Magazin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uz.isystem.Magazin.dto.ProcessStatusesDto;
import uz.isystem.Magazin.repository.ProcessStatusesRepository;

@Service
public class ProcessStatusesService {
    @Autowired
    private ProcessStatusesRepository processStatusesRepository;

    public ProcessStatusesDto create(ProcessStatusesDto processStatuses) {
        return null;
    }

    public ProcessStatusesDto get(Integer id) {
        return null;
    }

    public boolean update(Integer id, ProcessStatusesDto processStatuses) {
        return false;
    }

    public boolean delete(Integer id) {
        return false;
    }
}
