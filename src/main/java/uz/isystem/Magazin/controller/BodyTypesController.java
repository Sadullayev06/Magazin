package uz.isystem.Magazin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.isystem.Magazin.dto.BodyTypesDto;
import uz.isystem.Magazin.service.BodyTypesService;

@RestController
@RequestMapping("/bodytypes")
public class BodyTypesController {
    @Autowired
    private BodyTypesService bodyTypesService;

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody BodyTypesDto bodyTypes){
        BodyTypesDto result = bodyTypesService.create(bodyTypes);
        return ResponseEntity.ok(result);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> get(@PathVariable("id") Integer id){
        BodyTypesDto result = bodyTypesService.get(id);
        return ResponseEntity.ok(result);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable("id") Integer id,
                                    @RequestBody BodyTypesDto bodyTypes){
        boolean result = bodyTypesService.update(id,bodyTypes);
        return ResponseEntity.ok(result);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Integer id){
        boolean result = bodyTypesService.delete(id);
        return ResponseEntity.ok(result);
    }
}
