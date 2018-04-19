/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author alunoces
 */
public class Usuario {
    private String nome;
    private String matricula;
    private String senha;

    public Usuario() {
        nome = "Admin";
        matricula = "AC2018";
        senha = "s1234";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }    
    
    public boolean verificarSenha(String passWord){
        if(passWord.length() == 5 || senha != null) return true;
        return false;    
    }
    
    public boolean verificarMatricula(String matric){
        if(matric.length() == 6 ) return true;
        return false;
    }
    
    public boolean verificarLogin(String passWord, String matric){
        if( matric.toUpperCase().equals( this.matricula.toUpperCase() ) && passWord.equals(this.senha) ) return true;
        //senha.toUpperCase().equals( this.senha.toUpperCase() ) ) ou tbm senha.equalIgnoreCase();
        return false;    
    }

    @Override
    public String toString() {
        return "Usuario{" + "nome=" + nome + ", matricula=" + matricula + ", senha=" + senha + '}';
    }
    
    
    
    
}
