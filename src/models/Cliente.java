/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.Date;

/**
 *
 * @author aluno
 */
public class Cliente extends Pessoa {
    private String Endereco;
    private String Cep;
    
    public Cliente(int id, String nome, char sexo, String dataNascimento, String telefone, String email, String rg, String Endereco, String Cep) {
        super(id, nome, sexo, dataNascimento, telefone, email, rg);
        this.Endereco = Endereco;
        this.Cep = Cep; 
    }
    public void operation0(){
        
    }
    public void operation1(){
        
    }

    public String getEndereco() {
        return Endereco;
    }

    public String getCep() {
        return Cep;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public void setCep(String Cep) {
        this.Cep = Cep;
    }

    @Override
    public String toString() {
        return getNome();
    }

    
    
    
    
}
