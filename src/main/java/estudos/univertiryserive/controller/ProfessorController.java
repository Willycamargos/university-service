package estudos.univertiryserive.controller;

import estudos.univertiryserive.model.Professor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("professores")
public class ProfessorController {
    @GetMapping
    public ResponseEntity<List<Professor>>getProfessor(){
        Professor professor = new Professor();
        professor.setNome("Carlos");
        professor.setNumeroMatricula(14);
        return ResponseEntity.ok(Collections.singletonList(professor));
    }
}
