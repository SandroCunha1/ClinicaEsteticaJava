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
public class Funcionario extends Pessoa {
    private String senha;
    private String NivelAcesso;
    
    public Funcionario(int id, String nome, char sexo, String dataNascimento, String telefone, String email, String rg, String senha, String NivelAcesso) {
        super(id, nome, sexo, dataNascimento, telefone, email, rg);
        this.senha = senha;
        this.NivelAcesso = NivelAcesso;
       
    }

    public Funcionario(int id, String nome,String senha) {
        super(id, nome);
        this.senha = senha;
    }
    

    public String getSenha() {
        return senha;
    }

    public String getNivelAcesso() {
        return NivelAcesso;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setNivelAcesso(String NivelAcesso) {
        this.NivelAcesso = NivelAcesso;
    }
    
    
}
