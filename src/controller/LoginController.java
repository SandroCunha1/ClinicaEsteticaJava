/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import models.Funcionario;
import view.ClinicaMedica;
import models.DAO.FuncionarioDAO;
import view.MenuPrincipal;
import controller.Helper.LoginHelper;

/**
 *
 * @author aluno
 */
public class LoginController {

    private final ClinicaMedica view;
    private final LoginHelper helper;
    

    public LoginController(ClinicaMedica view) {
        this.view = view;
        this.helper = new LoginHelper(view);
    }   
    

    public void systemLogin() {
        Funcionario funcionario = helper.obterModelo();
        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
        Funcionario funcionarioAutenticado = funcionarioDAO.selectPorNomeESenha(funcionario);      
        if (funcionarioAutenticado != null) {
            MenuPrincipal menu = new MenuPrincipal();
            menu.setVisible(true);
            this.view.dispose();

        } else {
            view.exibirMensagem("Usuario ou senha Invalidos");
        }

    }
}
