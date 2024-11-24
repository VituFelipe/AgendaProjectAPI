package com.APIAgendamentoProject.APIagenda.service;

import com.APIAgendamentoProject.APIagenda.DTO.ServicoRespostaDTO;
import com.APIAgendamentoProject.APIagenda.model.Servico;
import com.APIAgendamentoProject.APIagenda.repository.ServicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServicoService {
    @Autowired
    private ServicoRepository servicoRepository;

    public List<ServicoRespostaDTO> findAll(){
        List<Servico> servicos = servicoRepository.findAll();
        List<ServicoRespostaDTO> servicosDTO = new ArrayList<>();

        for (Servico servico: servicos) {
            servicosDTO.add(new ServicoRespostaDTO(servico));
        }

        return servicosDTO;
    }

    public ServicoRespostaDTO findServiceById(Integer id) {
        return new ServicoRespostaDTO(servicoRepository.findById(id).get()) ;
    }
}

