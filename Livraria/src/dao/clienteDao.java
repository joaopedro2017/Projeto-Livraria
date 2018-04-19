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
 * @author John Peter
 */
public class clienteDao {
    private List<Cliente> lista;

    public clienteDao() {
        lista = new ArrayList<Cliente>();
    }
    
    public void adicionarCliente(Cliente cliente){
        lista.add(cliente);
    }
    
    public Cliente buscarCliente(String cpf){
        Cliente cli = null;
        for(int i = 0; i < lista.size(); i++){
            if(cpf.equals(lista.get(i).getCPF()))
                cli = lista.get(i);
        }
        return cli;
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
