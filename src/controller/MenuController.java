/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import view.Agenda;
import view.ClinicaMedica;
import view.MenuPrincipal;

/**
 *
 * @author Usuário
 */
public class MenuController {
    private final MenuPrincipal view;

    public MenuController(MenuPrincipal view) {
        this.view = view;
    }
    
    public void abrirParaAgenda(){
        Agenda agenda = new Agenda();
        agenda.setVisible(true);

    }
    
    
    public void voltarParaLogin(){
    ClinicaMedica clinica = new ClinicaMedica();
        clinica.setVisible(true);
        this.view.setVisible(false);
    }
}
