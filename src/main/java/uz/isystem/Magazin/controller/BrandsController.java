package uz.isystem.Magazin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.isystem.Magazin.dto.BrandsDto;
import uz.isystem.Magazin.service.BrandsService;

@RestController
@RequestMapping("/brands")
public class BrandsController {
    @Autowired
    private BrandsService brandsService;

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody BrandsDto brands){
        BrandsDto result = brandsService.create(brands);
        return ResponseEntity.ok(result);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> get(@PathVariable("id")Integer id){
        BrandsDto result = brandsService.get(id);
        return ResponseEntity.ok(result);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable("id") Integer id,
                                    @RequestBody BrandsDto brands){
        boolean result = brandsService.update(id,brands);
        return ResponseEntity.ok(result);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Integer id){
        boolean result = brandsService.delete(id);
        return ResponseEntity.ok(result);
    }
}
