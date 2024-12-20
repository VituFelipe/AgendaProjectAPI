package com.APIAgendamentoProject.APIagenda.DTO;

import com.APIAgendamentoProject.APIagenda.model.Funcionario;

public class FuncionarioRespostaDTO {
    private Integer id;
    private String nome;
    private String telefone;
    private String email;
    private Double salario  ;

    public FuncionarioRespostaDTO(Funcionario funcionario){
        id = funcionario.getId();
        nome    = funcionario.getNome();
        telefone = funcionario.getTelefone();
        email   = funcionario.getEmail();;
        salario= funcionario.getSalario();;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
}
