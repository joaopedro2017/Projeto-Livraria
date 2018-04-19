/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author John Peter
 */
public class Livro {
    private int codigo;
    private String titulo;
    private String fornecedor;
    private int quantidade;
    private double valorUnitario;
    private Date data;

    public Livro() {
    }

    public Livro(int codigo, String titulo, String fornecedor, int quantidade, double valorUnitario, Date data) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.fornecedor = fornecedor;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
        this.data = data;
    }

    @Override
    public String toString() {
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        return "Livro: " + titulo + 
                "\nCódigo: " + codigo + 
                "\nQuantidade: " + quantidade + 
                "\nValor Unitário: " + valorUnitario +
                "\nEditora: " + fornecedor +
                "\nData de Publicação: " + df.format(data) + "\n";
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public Date getData() {
        return data;
    }
    
    public void setData(Date data) {
        this.data = data;
    }
    
}
