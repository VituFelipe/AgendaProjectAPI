package com.APIAgendamentoProject.APIagenda.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Endereco {
    @Id
    @GeneratedValue
    private Integer id;
    private String cep;
    private String logradouro;
    private Integer numero;
    private String bairro;
    private String localidade;
    private String uf;
}
