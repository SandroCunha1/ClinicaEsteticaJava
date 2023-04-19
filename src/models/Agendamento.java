/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aluno
 */
public class Agendamento {
    protected int ID;
    protected Cliente cliente;
    protected Servico servico;
    protected Funcionario funcionario;
    protected int valor;
    protected String data;
    protected String hora;
    protected String observacao;

    public Agendamento(int ID, Cliente cliente, Servico servico, Funcionario funcionario, int valor, String data, String hora, String observacao) {
        this.ID = ID;
        this.cliente = cliente;
        this.servico = servico;
        this.funcionario = funcionario;
        this.valor = valor;        
        this.observacao = observacao;
        this.data = data;
        this.hora = hora;
    }

    public Agendamento(int ID, Cliente cliente, Servico servico, int valor, String data, String hora) {
        this.ID = ID;
        this.cliente = cliente;
        this.servico = servico;
        this.valor = valor;
        this.data = data;
        this.hora = hora;
    }
    public Agendamento(int ID, Cliente cliente, Servico servico, int valor, String data, String hora, String observacao) {
        this.ID = ID;
        this.cliente = cliente;
        this.servico = servico;
        this.valor = valor;
        this.data = data;
        this.hora = hora;
        this.observacao = observacao;
    }
    

    public int getID() {
        return ID;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Servico getServico() {
        return servico;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public float getValor() {
        return valor;
    }

    public String getData() {
        return data;
    }

    public String getHora() {
        return hora;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String obcervacao) {
        this.observacao = obcervacao;
    }
    
    
    
    
    
    
    
    
}
