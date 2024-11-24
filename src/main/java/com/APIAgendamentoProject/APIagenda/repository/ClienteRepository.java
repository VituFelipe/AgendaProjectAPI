package com.APIAgendamentoProject.APIagenda.repository;

import com.APIAgendamentoProject.APIagenda.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
