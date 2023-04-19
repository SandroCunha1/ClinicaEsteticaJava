/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.Helper;

import models.Funcionario;
import view.ClinicaMedica;

/**
 *
 * @author aluno
 */
public class LoginHelper implements IHelper {
    private final ClinicaMedica view;
    
    public LoginHelper(ClinicaMedica view) {
        this.view = view;
    }
    
    public Funcionario obterModelo(){
        String nome = view.getTextUser().getText();
        String senha = view.getTextSenha().getText();
        Funcionario modelo = new Funcionario(0, nome, senha);
        return modelo;
    }

    @Override
    public void limparTela() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
