package com.APIAgendamentoProject.APIagenda.repository;

import com.APIAgendamentoProject.APIagenda.model.Agenda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgendaRepository extends JpaRepository<Agenda, Integer> {

}
