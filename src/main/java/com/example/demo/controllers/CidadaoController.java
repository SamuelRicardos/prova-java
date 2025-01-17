package com.example.demo.controllers;

import com.example.demo.model.Cidadao;
import com.example.demo.service.CidadaoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/cidadao")
public class CidadaoController {

    @Autowired
    private CidadaoService cidadaoService;

    @GetMapping("/")
    public List<Cidadao> listarCidadaos() {
        return cidadaoService.listarCidadaos();
    }

    @PostMapping("/")
    public ResponseEntity<Cidadao> criarCidadao(@RequestBody @Valid Cidadao cidadao) {
        Cidadao novoCidadao = cidadaoService.criarCidadao(cidadao);
        return new ResponseEntity<>(novoCidadao, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cidadao> encontrarCidadaoPorId(@PathVariable("id") Long id) {
        Cidadao cidadao = cidadaoService.encontrarCidadaoPorId(id);
        return new ResponseEntity<>(cidadao, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Cidadao> alterarDadosCidadao(@PathVariable("id") Long id, @RequestBody Cidadao cidadao) {
        Cidadao cidadaoAlterado = cidadaoService.alterarDadosCidadao(id, cidadao);
        return new ResponseEntity<>(cidadaoAlterado, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Cidadao> deletarCidadao(@PathVariable("id") Long id) {
        cidadaoService.deletarDadosCidadao(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
