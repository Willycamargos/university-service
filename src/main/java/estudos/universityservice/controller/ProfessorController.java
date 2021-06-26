package estudos.universityservice.controller;

import estudos.universityservice.model.Professor;
import estudos.universityservice.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("professores")
public class ProfessorController {

    private final ProfessorRepository repository;

    @Autowired
    public ProfessorController(ProfessorRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public ResponseEntity<?> getProfessor() {
        return ResponseEntity.ok(repository.findAll());
    }
}
