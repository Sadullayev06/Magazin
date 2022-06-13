package uz.isystem.Magazin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.isystem.Magazin.dto.ModelsDto;
import uz.isystem.Magazin.service.ModelsService;

@RestController
@RequestMapping("/models")
public class ModelsController {
    @Autowired
    private ModelsService modelsService;

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody ModelsDto models){
        ModelsDto result = modelsService.create(models);
        return ResponseEntity.ok(result);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> get(@PathVariable("id") Integer id){
        ModelsDto result = modelsService.get(id);
        return ResponseEntity.ok(result);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable("id") Integer id,
                                    @RequestBody ModelsDto models){
        boolean result = modelsService.update(id,models);
        return ResponseEntity.ok(result);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Integer id){
        boolean result = modelsService.delete(id);
        return ResponseEntity.ok(result);
    }
}
