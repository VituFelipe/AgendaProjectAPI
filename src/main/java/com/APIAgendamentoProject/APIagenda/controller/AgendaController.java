package com.APIAgendamentoProject.APIagenda.controller;

import com.APIAgendamentoProject.APIagenda.DTO.AgendaRespostaDTO;
import com.APIAgendamentoProject.APIagenda.service.AgendaService;
import jakarta.websocket.Endpoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AgendaController {

    @Autowired
    public AgendaService agendaService;

    private static final String ENDPOINT = "/api/agendas";

    @GetMapping(ENDPOINT)
    @CrossOrigin
    public List<AgendaRespostaDTO> findAll(){
        return agendaService.findAll();
    }

    @GetMapping(ENDPOINT + "/{id}")
    @CrossOrigin
    public AgendaRespostaDTO findOne(@PathVariable("id") Integer id){
        return agendaService.findById(id);
    }

}
