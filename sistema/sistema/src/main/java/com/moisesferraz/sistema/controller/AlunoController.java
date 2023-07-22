package com.moisesferraz.sistema.controller;

import com.moisesferraz.sistema.dto.AlunoRecordDto;
import com.moisesferraz.sistema.model.AlunoModel;
import com.moisesferraz.sistema.repository.AlunoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlunoController {
    @Autowired
    AlunoRepository alunoRepository;

    @PostMapping("/aluno")
    public ResponseEntity<AlunoModel> saveAluno(@RequestBody @Valid AlunoRecordDto alunoRecordDto) {
        var alunoModel = new AlunoModel();
        BeanUtils.copyProperties(alunoRecordDto, alunoModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(alunoRepository.save(alunoModel));
    }
}