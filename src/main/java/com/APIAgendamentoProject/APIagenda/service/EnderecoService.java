package com.APIAgendamentoProject.APIagenda.service;

import com.APIAgendamentoProject.APIagenda.model.Endereco;
import com.APIAgendamentoProject.APIagenda.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EnderecoService {

    @Autowired
    private EnderecoRepository enderecoRepository
            ;

    public List<Endereco> findAll(){
        return enderecoRepository.findAll();
    }

    public Endereco add(Endereco endereco){
        return enderecoRepository.save(endereco);

    }

    public Optional<Endereco> findOne(Integer id){
        return enderecoRepository.findById(id);

    }

    public void delete (Integer id){
        enderecoRepository.deleteById(id);
    }
}
