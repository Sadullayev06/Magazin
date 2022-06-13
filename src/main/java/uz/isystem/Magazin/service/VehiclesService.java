package uz.isystem.Magazin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uz.isystem.Magazin.dto.VehiclesDto;
import uz.isystem.Magazin.repository.VehiclesRepository;

@Service
public class VehiclesService {
    @Autowired
    private VehiclesRepository vehiclesRepository;

    public VehiclesDto create(VehiclesDto vehicles) {
        return null;
    }

    public VehiclesDto get(Integer id) {
        return null;
    }

    public boolean update(Integer id, VehiclesDto vehicles) {
        return false;
    }

    public boolean delete(Integer id) {
        return false;
    }
}
