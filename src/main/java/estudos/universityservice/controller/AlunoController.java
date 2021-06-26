package estudos.universityservice.controller;

import estudos.universityservice.model.Aluno;
import estudos.universityservice.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("aluno")
public class AlunoController {

    private final AlunoRepository repository;

    @Autowired
    public AlunoController(AlunoRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public ResponseEntity<?> getAluno() {
        return ResponseEntity.ok(repository.findAll());
    }

    @PostMapping
    public ResponseEntity<Aluno> criar(@RequestBody Aluno aluno) {
        return ResponseEntity.ok(repository.save(aluno));
    }


}
