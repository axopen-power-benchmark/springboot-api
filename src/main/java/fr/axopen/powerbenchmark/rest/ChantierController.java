package fr.axopen.powerbenchmark.rest;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.axopen.powerbenchmark.dto.ChantierDTO;
import fr.axopen.powerbenchmark.service.ChantierService;

@RestController
@RequestMapping("api/chantier")
public class ChantierController {

    private final ChantierService chantierService;

    public ChantierController(ChantierService chantierService) {
        this.chantierService = chantierService;
    }

    @GetMapping()
    public ResponseEntity<ChantierDTO> getRandomChantier() {
        return ResponseEntity.ok(this.chantierService.getRandomChantier());
    }

    @PostMapping()
    public ResponseEntity<Void> saveRandomChantier() {
        this.chantierService.randomUpdate();
        return ResponseEntity.noContent().build();
    }
}
