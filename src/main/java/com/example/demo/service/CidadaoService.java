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

    public Cidadao criarCidadao(Cidadao cidadao) {
        Cidadao novoCidadao = new Cidadao();
        novoCidadao.setNome(cidadao.getNome());
        novoCidadao.setCpf(cidadao.getCpf());
        novoCidadao.setEndereco(cidadao.getEndereco());
        novoCidadao.setSexo(cidadao.getSexo());

        return novoCidadao;
    }
}
