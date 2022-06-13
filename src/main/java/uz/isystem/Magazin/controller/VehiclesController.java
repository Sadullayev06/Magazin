package uz.isystem.Magazin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.isystem.Magazin.dto.VehiclesDto;
import uz.isystem.Magazin.service.VehiclesService;

@RestController
@RequestMapping("/vehicles")
public class VehiclesController {
    @Autowired
    private VehiclesService vehiclesService;

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody VehiclesDto vehicles){
        VehiclesDto result = vehiclesService.create(vehicles);
        return ResponseEntity.ok(result);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> get(@PathVariable("id") Integer id){
        VehiclesDto result = vehiclesService.get(id);
        return ResponseEntity.ok(result);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable("id") Integer id,
                                    @RequestBody VehiclesDto vehicles){
        boolean result = vehiclesService.update(id,vehicles);
        return ResponseEntity.ok(result);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Integer id){
        boolean result = vehiclesService.delete(id);
        return ResponseEntity.ok(result);
    }
}
