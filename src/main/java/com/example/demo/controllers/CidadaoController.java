package com.example.demo.controllers;

import com.example.demo.model.Cidadao;
import com.example.demo.service.CidadaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
