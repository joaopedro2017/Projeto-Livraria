/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author JPEG
 */
public class Usuario {
    
    private String matricula;
    private String nome;
    private String senha;
    
    
    public Usuario() {
        this.matricula = "AC2018";
        this.nome = "Admin";
        this.senha = "s1234";
    }
    
    public boolean validarSenha(String senha){
        return (senha != null  && senha.length() == 5 );        
    }
    
    public boolean validarMatricula(String matricula){
        return matricula.length() == 6;
    }
    
    public boolean efetuarLogin(String matricula, String senha){        
        //senha.toUpperCase().equals( this.senha.toUpperCase() ) ) ou tbm senha.equalIgnoreCase();               
        return  (matricula.toUpperCase().equals( this.matricula.toUpperCase() ) && senha.equals(this.senha));
    }
    
}
