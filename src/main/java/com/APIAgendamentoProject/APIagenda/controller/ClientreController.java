package com.APIAgendamentoProject.APIagenda.controller;

import com.APIAgendamentoProject.APIagenda.DTO.ClienteRespostaDTO;
import com.APIAgendamentoProject.APIagenda.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClientreController {

    @Autowired
    private ClienteService clienteService;

    private static final String ENDPOINT = "/api/clientes";

    @GetMapping(ENDPOINT)
    @CrossOrigin
    public List<ClienteRespostaDTO> findAll(){
        return clienteService.findAll();
    }

    @GetMapping(ENDPOINT + "/{id}")
    @CrossOrigin
    public ClienteRespostaDTO findOne(@PathVariable("id") Integer id){
        return clienteService.findById(id);
    }
}
