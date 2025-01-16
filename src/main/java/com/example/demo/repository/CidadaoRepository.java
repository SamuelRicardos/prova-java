package com.example.demo.repository;


import com.example.demo.model.Cidadao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CidadaoRepository extends JpaRepository<Cidadao, Long> {

   public Optional<Cidadao> findById(Long id);
}
