package uz.isystem.Magazin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.isystem.Magazin.dto.UserTypesDto;
import uz.isystem.Magazin.service.UserTypesService;

@RestController
@RequestMapping("/usertypes")
public class UserTypesController {
    @Autowired
    private UserTypesService userTypesService;

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody UserTypesDto userTypes){
        UserTypesDto result = userTypesService.create(userTypes);
        return ResponseEntity.ok(result);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> get(@PathVariable("id") Integer id){
        UserTypesDto result = userTypesService.get(id);
        return ResponseEntity.ok(result);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable("id") Integer id,
                                    @RequestBody UserTypesDto userTypes){
        boolean result = userTypesService.update(id,userTypes);
        return ResponseEntity.ok(result);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Integer id){
        boolean result = userTypesService.delete(id);
        return ResponseEntity.ok(result);
    }
}
