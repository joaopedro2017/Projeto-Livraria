/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import model.Livro;

/**
 *
 * @author John Peter
 */
public class livroDao {
    private List<Livro> lista;

    public livroDao() {
        lista = new ArrayList<Livro>();
    }
    
    public void adicionarLivro(Livro livro){
        lista.add(livro);
    }
    
    @SuppressWarnings("empty-statement")
    public Livro buscarLivro(int codigo){
        Livro livro = null;
               
        for(int i = 0; i < lista.size(); i++){
            if(lista.get(i).getCodigo() == codigo){
                livro = lista.get(i);
            }        
        }       
        return livro;   
    }
    
    public void removerLivro(Livro livro){
        lista.remove(livro);              
    }
    
    public void alterarLivro(Livro livro){
        lista.set( lista.indexOf(livro), livro );            
    }
    
    public List<Livro> todosLivros(){
        return lista;
    }  
}
