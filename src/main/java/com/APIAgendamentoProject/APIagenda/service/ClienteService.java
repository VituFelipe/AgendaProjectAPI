package com.APIAgendamentoProject.APIagenda.service;

import com.APIAgendamentoProject.APIagenda.DTO.ClienteRespostaDTO;
import com.APIAgendamentoProject.APIagenda.model.Cliente;
import com.APIAgendamentoProject.APIagenda.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public List<ClienteRespostaDTO> findAll() {
        List< Cliente> clientes = clienteRepository.findAll();
        List < ClienteRespostaDTO> clientesDTO = new ArrayList<>();

        for (Cliente cliente: clientes){
            clientesDTO.add(new ClienteRespostaDTO(cliente));
        }
        return clientesDTO;


    }

    public ClienteRespostaDTO findById(Integer id){
        return new ClienteRespostaDTO(clienteRepository.findById(id).get()      );

    }
}
