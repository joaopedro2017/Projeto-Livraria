/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import model.Cliente;

/**
 *
 * @author JPEG
 */
public class ClienteDao {
    
    private List<Cliente> lista;

    public ClienteDao() {
        lista = new ArrayList<Cliente>();
    }
    
    public void adicionaCliente(Cliente cliente){
        lista.add(cliente);
    }
    
    public Cliente buscarCliente(String cpf){
        for(int i = 0; i < lista.size(); i++){
            if(cpf.equals( lista.get(i).getCPF() ))
                return lista.get(i);
        }
        return null;
    }
    
    public void removerCliente(Cliente cliente){
        lista.remove(cliente);              
    }
    
    public void alterarCliente(Cliente cli){
        lista.set( lista.indexOf(cli), cli);           
    }
    
    public List<Cliente> todosClientes(){
        return lista;
    }    
}
