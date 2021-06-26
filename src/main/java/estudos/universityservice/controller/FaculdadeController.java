package estudos.universityservice.controller;

import estudos.universityservice.model.Faculdade;
import estudos.universityservice.repository.FaculdadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("faculdade")
public class FaculdadeController {
    private final FaculdadeRepository repository;

    @Autowired
    public FaculdadeController(FaculdadeRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public ResponseEntity<?> getFaculdade() {
        return ResponseEntity.ok(repository.findAll());
    }

    @PostMapping
    public ResponseEntity<Faculdade> criar(@RequestBody Faculdade faculdade) {
        return ResponseEntity.ok(repository.save(faculdade));
    }
}
