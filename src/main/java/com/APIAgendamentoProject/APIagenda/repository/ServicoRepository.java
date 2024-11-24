package com.APIAgendamentoProject.APIagenda.repository;

import com.APIAgendamentoProject.APIagenda.model.Servico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServicoRepository extends JpaRepository<Servico, Integer> {
}
