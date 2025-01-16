package com.example.demo.controllers;

import com.example.demo.model.Cidadao;
import com.example.demo.repository.CidadaoRepository;
import com.example.demo.service.CidadaoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/cidadao")
public class CidadaoController {

    @Autowired
    private CidadaoService cidadaoService;

    @Autowired
    private CidadaoRepository cidadaoRepository;

    @GetMapping("/")
    public List<Cidadao> listarCidadaos() {
        return cidadaoService.listarCidadaos();
    }

    @PostMapping("/")
    public Cidadao criarCidadao(@RequestBody @Valid Cidadao cidadao) {
        return cidadaoRepository.save(cidadao);
    }

}
