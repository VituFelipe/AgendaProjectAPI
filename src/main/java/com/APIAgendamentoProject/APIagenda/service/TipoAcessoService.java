package com.APIAgendamentoProject.APIagenda.service;

import com.APIAgendamentoProject.APIagenda.model.TipoAcesso;
import com.APIAgendamentoProject.APIagenda.repository.TipoAcessoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TipoAcessoService {
    @Autowired
    private TipoAcessoRepository tipoAcessoRepository;

    public TipoAcesso add(TipoAcesso usuario){
        return tipoAcessoRepository.save(usuario);
    }

    public List<TipoAcesso> findAll(){
        return tipoAcessoRepository.findAll();

    }

    public Optional<TipoAcesso> findById(Integer id){
        return tipoAcessoRepository.findById(id);
    }
}
