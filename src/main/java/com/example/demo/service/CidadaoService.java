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
        return cidadaoRepository.save(cidadao);
    }

    public Cidadao encontrarCidadaoPorId(Long id) {
        return cidadaoRepository.findById(id).orElseThrow(() -> new RuntimeException("Cidadão não encontrado com o ID: " + id));
    }

    public Cidadao alterarDadosCidadao(Long id, Cidadao cidadaoAtualizado) {
        Cidadao cidadaoExistente = cidadaoRepository.findById(id).orElseThrow(() -> new RuntimeException("Cidadão não encontrado com o ID: " + id));

        cidadaoExistente.setNome(cidadaoAtualizado.getNome());
        cidadaoExistente.setCpf(cidadaoAtualizado.getCpf());
        cidadaoExistente.setEndereco(cidadaoAtualizado.getEndereco());
        cidadaoExistente.setSexo(cidadaoAtualizado.getSexo());

        return cidadaoRepository.save(cidadaoExistente);
    }

    public void deletarDadosCidadao(Long id) {
        Cidadao cidadaoDeletado = cidadaoRepository.findById(id).orElseThrow(() -> new RuntimeException("Cidadão não encontrado com o ID:" + id));
        cidadaoRepository.delete(cidadaoDeletado);
    }
}
