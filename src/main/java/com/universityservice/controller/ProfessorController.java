package com.universityservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.universityservice.model.Professor;

@RestController
public class ProfessorController implements ProfessorApi {

	@Override public ResponseEntity<Professor> cadastrarProfessor(Professor professor) {
		return ProfessorApi.super.cadastrarProfessor(professor);
	}
}
