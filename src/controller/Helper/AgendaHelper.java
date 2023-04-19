/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.Helper;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import models.Agendamento;
import models.Cliente;
import models.Servico;
import view.Agenda;

/**
 *
 * @author Usuário
 */
public class AgendaHelper implements IHelper {
    private final Agenda view;

    public AgendaHelper(Agenda view) {
        this.view = view;
    }
    

    public void preencherTabela(ArrayList<Agendamento> agendamentos) {
        
        DefaultTableModel tableModel = (DefaultTableModel) view.getTableAgendamento().getModel();
        tableModel.setNumRows(0);
        
        for (Agendamento agendamento : agendamentos) {
            tableModel.addRow(new Object[]{
                agendamento.getID(),
                agendamento.getCliente().getNome(),
                agendamento.getServico().getDescricao(),
                agendamento.getValor(),
                agendamento.getData(),
                agendamento.getHora(),
                agendamento.getObservacao()
            });
        }
    }

    public void preencherCliente(ArrayList<Cliente> clientes) {
        DefaultComboBoxModel comboModel = (DefaultComboBoxModel) view.getComboCliente().getModel();
        for (Cliente cliente : clientes) {   
            comboModel.addElement(cliente);
        }
        }

    public void preencherServico(ArrayList<Servico> servicos) {
        DefaultComboBoxModel comboModel = (DefaultComboBoxModel) view.getComboServico().getModel();
        for (Servico servico : servicos) {   
            comboModel.addElement(servico);
        }
        }

    public Servico obterServico() {
        return (Servico) view.getComboServico().getSelectedItem();
        }
    public Cliente obterCliente() {
        return (Cliente) view.getComboCliente().getSelectedItem();
        }

    public void setarValor(int valor) {
        view.getTxtValor().setText(valor+"");
      }

    @Override
    public Agendamento obterModelo() {
        String idString = view.getTxtID().getText();
        int id = Integer.parseInt(idString);
        Cliente cliente = obterCliente();
        Servico servico = obterServico();
        String valorString = view.getTxtValor().getText();
        int valor = Integer.parseInt(valorString);
        String data = view.getTxtData().getText();
        String hora = view.getTxtHora().getText();
        String observacao = view.getTxtArea().getText();
        
        Agendamento agendamento = new Agendamento(id, cliente, servico, valor, data, hora, observacao);
        return agendamento;
        //new Agendamento(0, cliente, servico, 0, data, hora);
        }

    @Override
    public void limparTela() {
        view.getTxtArea().setText("");
        view.getTxtData().setText("");
        view.getTxtHora().setText("");
        view.getTxtID().setText("");
        }
}
