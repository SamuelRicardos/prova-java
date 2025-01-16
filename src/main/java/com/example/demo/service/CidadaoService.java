package com.example.demo.service;

import com.example.demo.model.Cidadao;
import com.example.demo.repository.CidadaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CidadaoService {

    @Autowired
    private CidadaoRepository cidadaoRepository;

    public List<Cidadao> listarCidadaos() {
        return cidadaoRepository.findAll();
    }
}
