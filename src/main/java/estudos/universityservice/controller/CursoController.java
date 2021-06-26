package estudos.universityservice.controller;

import estudos.universityservice.model.Curso;
import estudos.universityservice.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("cursos")
public class CursoController {

    private final CursoRepository repository;

    @Autowired
    public CursoController(CursoRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public ResponseEntity<?> getCurso() {
        return ResponseEntity.ok(repository.findAll());
    }

    @PostMapping
    public ResponseEntity<Curso> criar(@RequestBody Curso curso) {
        return ResponseEntity.ok(repository.save(curso));
    }
}
