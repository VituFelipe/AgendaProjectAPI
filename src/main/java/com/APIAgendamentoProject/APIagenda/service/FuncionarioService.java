package com.APIAgendamentoProject.APIagenda.service;

import com.APIAgendamentoProject.APIagenda.DTO.FuncionarioRespostaDTO;
import com.APIAgendamentoProject.APIagenda.model.Funcionario;
import com.APIAgendamentoProject.APIagenda.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FuncionarioService {

    @Autowired
    private FuncionarioRepository funcionarioRepository;

    public List<FuncionarioRespostaDTO> findAll(){
        List<Funcionario> funcionarios = funcionarioRepository.findAll();
        List<FuncionarioRespostaDTO> funcionarioRespostaDTOS = new ArrayList<>();

        for(Funcionario funcionario: funcionarios){
            funcionarioRespostaDTOS.add(new FuncionarioRespostaDTO(funcionario));

        }
        return funcionarioRespostaDTOS;
    }

    public FuncionarioRespostaDTO findById(Integer id){
        return new FuncionarioRespostaDTO(funcionarioRepository.findById(id).get());
    }
}
