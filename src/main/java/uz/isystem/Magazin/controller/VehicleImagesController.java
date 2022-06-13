package uz.isystem.Magazin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.isystem.Magazin.dto.VehicleImagesDto;
import uz.isystem.Magazin.service.VehicleImagesService;

@RestController
@RequestMapping("/vehicleimages")
public class VehicleImagesController {
    @Autowired
    private VehicleImagesService vehicleImagesService;

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody VehicleImagesDto vehicleImages){
        VehicleImagesDto result = vehicleImagesService.create(vehicleImages);
        return ResponseEntity.ok(result);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> get(@PathVariable("id") Integer id){
        VehicleImagesDto result = vehicleImagesService.get(id);
        return ResponseEntity.ok(result);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable("id") Integer id,
                                    @RequestBody VehicleImagesDto vehicleImages){
        boolean result = vehicleImagesService.update(id,vehicleImages);
        return ResponseEntity.ok(result);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Integer id){
        boolean result = vehicleImagesService.delete(id);
        return ResponseEntity.ok(result);
    }
}
