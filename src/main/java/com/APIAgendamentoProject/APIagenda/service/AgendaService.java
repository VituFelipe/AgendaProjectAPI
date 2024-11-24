package com.APIAgendamentoProject.APIagenda.service;

import com.APIAgendamentoProject.APIagenda.DTO.AgendaRespostaDTO;
import com.APIAgendamentoProject.APIagenda.model.Agenda;
import com.APIAgendamentoProject.APIagenda.repository.AgendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AgendaService {

    @Autowired
    private AgendaRepository agendaRepository;

    public List<AgendaRespostaDTO> findAll(){
        List<Agenda> agendas = agendaRepository.findAll();
        List<AgendaRespostaDTO> agendasDTO = new ArrayList<>();

        for(Agenda agenda: agendas){
            agendasDTO.add(new AgendaRespostaDTO(agenda));
        }
        return agendasDTO;
    }

    public AgendaRespostaDTO findById(Integer id){
        return new AgendaRespostaDTO(agendaRepository.findById(id).get());

    }
}
