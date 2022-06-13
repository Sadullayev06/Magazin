package uz.isystem.Magazin.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.isystem.Magazin.dto.ApplicationsDto;
import uz.isystem.Magazin.service.ApplicationsService;

@RestController
@RequestMapping("/applications")
public class ApplicationsController {
    @Autowired
    private ApplicationsService applicationsService;

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody ApplicationsDto applications) {
        ApplicationsDto result = applicationsService.create(applications);
        return ResponseEntity.ok(result);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> get(@PathVariable("id") Integer id){
        ApplicationsDto result = applicationsService.get(id);
        return ResponseEntity.ok(result);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable("id") Integer id,
                                    @RequestBody ApplicationsDto applications){
        boolean result = applicationsService.update(id,applications);
        return ResponseEntity.ok(result);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Integer id){
        boolean result = applicationsService.delete(id);
        return ResponseEntity.ok(result);
    }
}
