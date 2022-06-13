package uz.isystem.Magazin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.isystem.Magazin.dto.MerchantsDto;
import uz.isystem.Magazin.service.MerchantsService;

@RestController
@RequestMapping("/merchants")
public class MerchantsController {
    @Autowired
    private MerchantsService merchantsService;

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody MerchantsDto merchants){
        MerchantsDto result = merchantsService.create(merchants);
        return ResponseEntity.ok(result);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> get(@PathVariable("id") Integer id){
        MerchantsDto result = merchantsService.get(id);
        return ResponseEntity.ok(result);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable("id") Integer id,
                                    @RequestBody MerchantsDto merchants){
        boolean result = merchantsService.update(id,merchants);
        return ResponseEntity.ok(result);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Integer id){
        boolean result = merchantsService.delete(id);
        return ResponseEntity.ok(result);
    }
}
