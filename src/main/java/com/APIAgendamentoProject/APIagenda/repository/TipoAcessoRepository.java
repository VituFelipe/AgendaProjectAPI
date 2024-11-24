package com.APIAgendamentoProject.APIagenda.repository;

import com.APIAgendamentoProject.APIagenda.model.TipoAcesso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoAcessoRepository extends JpaRepository<TipoAcesso, Integer> {
}
