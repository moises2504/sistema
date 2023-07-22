package com.moisesferraz.sistema.repository;

import com.moisesferraz.sistema.model.AlunoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface AlunoRepository extends JpaRepository<AlunoModel, UUID> {



}
