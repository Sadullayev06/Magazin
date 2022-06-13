package uz.isystem.Magazin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uz.isystem.Magazin.dto.VehicleImagesDto;
import uz.isystem.Magazin.repository.VehicleImagesRepository;

@Service
public class VehicleImagesService {
    @Autowired
    private VehicleImagesRepository vehicleImagesRepository;

    public VehicleImagesDto create(VehicleImagesDto vehicleImages) {
        return null;
    }

    public VehicleImagesDto get(Integer id) {
        return null;
    }

    public boolean update(Integer id, VehicleImagesDto vehicleImages) {
        return false;
    }

    public boolean delete(Integer id) {
        return false;
    }
}
