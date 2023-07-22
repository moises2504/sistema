package com.moisesferraz.sistema.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;


import java.time.LocalDate;

public record AlunoRecordDto(@NotBlank String nome, @NotNull String email, @NotNull LocalDate nascimento, @NotNull String enderco, @NotNull String senha, @NotNull String telefone) {


    }

