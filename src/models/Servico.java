/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author aluno
 */
public class Servico {
    protected int Id;
    protected String descricao;
    protected int valor;
    
    public Servico(int Id, String descricao, int valor) {
        this.Id = Id;
        this.descricao = descricao;
        this.valor = valor;
    }

    public int getId() {
        return Id;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getValor() {
        return valor;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return getDescricao();
    }
    
    
}
