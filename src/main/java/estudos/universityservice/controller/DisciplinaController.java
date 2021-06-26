package estudos.universityservice.controller;

import estudos.universityservice.model.Disciplina;
import estudos.universityservice.repository.DisciplinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("disciplina")
public class DisciplinaController {

    private final DisciplinaRepository repository;

    @Autowired
    public DisciplinaController(DisciplinaRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public ResponseEntity<?> getDisciplina() {
        return ResponseEntity.ok(repository.findAll());
    }

    @PostMapping
    public ResponseEntity<Disciplina> criar(@RequestBody Disciplina disciplina) {
        return ResponseEntity.ok(repository.save(disciplina));
    }


}
