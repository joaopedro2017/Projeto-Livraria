/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author JPGP
 */
public class Cliente {
    
    private String CPF;
    private String nome;
    private String estadoCivil;
    private String telefone;
    private String email;
    private Endereco endereco;

    public Cliente() {
        endereco = new Endereco();        
    }

    public Cliente(String CPF, String nome, String estadoCivil, String telefone, String email) {
        this.CPF = CPF;
        this.nome = nome;
        this.estadoCivil = estadoCivil;
        this.telefone = telefone;
        this.email = email;
        endereco = new Endereco();
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
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
    
}
