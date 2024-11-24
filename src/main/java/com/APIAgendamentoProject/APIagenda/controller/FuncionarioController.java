package com.APIAgendamentoProject.APIagenda.controller;

import com.APIAgendamentoProject.APIagenda.DTO.FuncionarioRespostaDTO;
import com.APIAgendamentoProject.APIagenda.service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FuncionarioController {

    @Autowired
    private FuncionarioService funcionarioService;

    private static final  String ENDPOINT = "/api/funcionarios";

    @GetMapping(ENDPOINT)
    @CrossOrigin
    public List<FuncionarioRespostaDTO> findAll(){
        return funcionarioService.findAll();
    }

    @GetMapping(ENDPOINT + "/{id}")
    @CrossOrigin
    public FuncionarioRespostaDTO findOne(@PathVariable("id") Integer id) {
        return funcionarioService.findById(id);
    }
}