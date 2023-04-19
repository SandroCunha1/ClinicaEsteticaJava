/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import controller.Helper.AgendaHelper;
import java.util.ArrayList;
import models.Agendamento;
import models.Cliente;
import models.DAO.AgendamentoDAO;
import models.DAO.ClienteDAO;
import models.DAO.ServicoDAO;
import models.Servico;
import view.Agenda;
import view.MenuPrincipal;

/**
 *
 * @author Usuário
 */
public class AgendaController {
    private final Agenda view;
    private final AgendaHelper helper;
    public AgendaController(Agenda view) {
        this.view = view;
        this.helper = new AgendaHelper(view);
    }
    

    public void atualizaTabela(){
        AgendamentoDAO agendamentoDao = new AgendamentoDAO();
        ArrayList<Agendamento> agendamentos = agendamentoDao.selectAll();
        
        helper.preencherTabela(agendamentos);
        System.err.println("Atualizou");
    }
    
    public void atualizaCliente(){
        ClienteDAO clienteDao = new ClienteDAO();
        ArrayList<Cliente> clientes = clienteDao.selectAll();
        
        helper.preencherCliente(clientes);
    }
    
    public void atualizaServico(){
        ServicoDAO servicoDao = new ServicoDAO();
        ArrayList<Servico> servicos = servicoDao.selectAll();
        
        helper.preencherServico(servicos);
    }
    public void atualizaValor(){
        Servico servico = helper.obterServico();
        helper.setarValor(servico.getValor());
    }
    
    public void agendar(){
        Agendamento agendamento = helper.obterModelo();
        
        new AgendamentoDAO().insert(agendamento);
        
        atualizaTabela();
        
        helper.limparTela();
        System.err.println("Clicou");
        System.err.println(agendamento.getID());
    }
}
