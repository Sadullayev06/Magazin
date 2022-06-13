package uz.isystem.Magazin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.isystem.Magazin.dto.ProcessStatusesDto;
import uz.isystem.Magazin.service.ProcessStatusesService;

@RestController
@RequestMapping("/processstatuses")
public class ProcessStatusesController {
    @Autowired
    private ProcessStatusesService processStatusesService;

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody ProcessStatusesDto processStatuses){
        ProcessStatusesDto result = processStatusesService.create(processStatuses);
        return ResponseEntity.ok(result);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> get(@PathVariable("id") Integer id){
        ProcessStatusesDto result = processStatusesService.get(id);
        return ResponseEntity.ok(result);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable("id") Integer id,
                                    @RequestBody ProcessStatusesDto processStatuses){
        boolean result = processStatusesService.update(id,processStatuses);
        return ResponseEntity.ok(result);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Integer id){
        boolean result = processStatusesService.delete(id);
        return ResponseEntity.ok(result);
    }
}
