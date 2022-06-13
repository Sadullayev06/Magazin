package uz.isystem.Magazin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.isystem.Magazin.dto.ApplicationTypesDto;
import uz.isystem.Magazin.service.ApplicationTypesService;

@RestController
@RequestMapping("/applicationtypes")
public class ApplicationTypesController {
    @Autowired
    private ApplicationTypesService applicationTypesService;

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody ApplicationTypesDto applicationTypes){
        ApplicationTypesDto result = applicationTypesService.create(applicationTypes);
        return ResponseEntity.ok(result);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> get(@PathVariable("id") Integer id){
        ApplicationTypesDto result = applicationTypesService.get(id);
        return ResponseEntity.ok(result);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable("id") Integer id,
                                    @RequestBody ApplicationTypesDto applicationTypes){
        boolean result = applicationTypesService.update(id,applicationTypes);
        return ResponseEntity.ok(result);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Integer id){
        boolean result = applicationTypesService.delete(id);
        return ResponseEntity.ok(result);
    }
}
