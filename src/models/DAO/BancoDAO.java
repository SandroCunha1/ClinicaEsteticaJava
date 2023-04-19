/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models.DAO;

import models.Agendamento;
import models.Cliente;
import models.Servico;
import models.Funcionario;
import java.util.ArrayList;

/**
 *
 * @author tiago
 */
public class BancoDAO {
    
    public static ArrayList<Funcionario> funcionario;
    public static ArrayList<Cliente> cliente;
    public static ArrayList<Servico> servico;
    public static ArrayList<Agendamento> agendamento;
    
    
    public static void inicia(){
    
        //Instancia os Objetos
        funcionario = new ArrayList<>();
        cliente = new ArrayList<>();
        servico = new ArrayList<>();
        agendamento = new ArrayList<>();
        
        //criando elementos
        
        Funcionario usuario1 = new Funcionario(1, "Simone", 'F', "09/05/1990", "30212121", "admin@estetshop.com", "521454123", "Admin", "admin123");
        Funcionario usuario2 = new Funcionario(2, "esteticista01", 'F', "09/05/1996", "30212122", "estagiario@estetshop.com", "451244123", "Estet01", "est123");
         
        Cliente cliente1 = new Cliente(1, "Alan Figueiredo", 'M', "30/01/1995", "30212126", "tiagoluz.h607@gmail.com", "5142487", "Rua jaboti 35 Canudos NH",  "93300012");
        Cliente cliente2 = new Cliente(2, "Judite Oliveira", 'F', "30/08/1994", "30212127", "juditeoliveirapet@gmail.com", "5142487745", "Rua campo bom 78 Centro NH",  "93300045");
        Cliente cliente3 = new Cliente(3, "Paulo Ricado", 'M', "24/04/1997", "30212128", "pauloricardopet@gmail.com", "78451458", "Rua Tres Irmaos 30 Vila Nova - NH",  "933007496");
        Cliente cliente4 = new Cliente(4, "Neymar Santos", 'M', "20/08/1995", "30212130", "neymarsantospet@gmail.com", "2745487", "Rua Lombardi 40 Canudos NH",  "93300748");
        Cliente cliente5 = new Cliente(5, "Debruine Souza", 'F', "13/09/1992", "30212131", "debruinepet@gmail.com", "4742487", "Rua pedro quaresma 784 Canudos Belgica",  "933000847");
        Cliente cliente6 = new Cliente(6, "Marcela Pareira", 'F', "17/08/1994", "302122324", "matuidipet@gmail.com", "78512457", "Rua champions 10 Kephas Franca",  "933000782");
        Cliente cliente7 = new Cliente(7, "Marta de Souza", 'F', "25/03/1993", "302121292", "martasouzapet@gmail.com", "4658237314", "Rua tesla 215 Canudos NH",  "93352012");
        Cliente cliente8 = new Cliente(8, "Aline Ferrari", 'F', "04/03/1990", "302121451", "alineferraripet@gmail.com", "8475123687", "Rua hyrule 32 Canudos NH",  "9334714747");
        Cliente cliente9 = new Cliente(9, "Samuel Coltinho", 'M', "09/02/1998", "302121189", "samuelcoltinhopet@gmail.com", "74595142487", "Rua floresta 12 Canudos NH",  "9330046364");
        Cliente cliente10 = new Cliente(10, "Felipe Rodrigues", 'M', "12/06/1999", "3021212478", "felipeluispet@gmail.com", "845713647", "Rua marechal 1023 Canudos NH",  "933000874");
        
        Servico servico1 = new Servico(1, "Depilação Completa", 200);
        Servico servico2 = new Servico(2, "Massagem Corporal", 100);
        Servico servico3 = new Servico(3, "Oxonio Barriga", 100);
        Servico servico4 = new Servico(4, "Botox area olhos", 150);
        Servico servico5 = new Servico(5, "Sombrancelhas", 50);
        Servico servico6 = new Servico(6, "Penteados", 120);

        Agendamento agendamento1 = new Agendamento(1, cliente1, servico2, 30, "14/04/2023", "09:30");
        Agendamento agendamento2 = new Agendamento(2, cliente3, servico4, 40, "14/04/2023", "10:00");
        Agendamento agendamento3 = new Agendamento(3, cliente4, servico1, 18, "14/04/2023", "10:30");
        
        //Adiciona Elementos na lista
        funcionario.add(usuario1);
        funcionario.add(usuario2);
        
        cliente.add(cliente1);
        cliente.add(cliente2);
        cliente.add(cliente3);
        cliente.add(cliente4);
        cliente.add(cliente5);
        cliente.add(cliente6);
        cliente.add(cliente7);
        cliente.add(cliente8);
        cliente.add(cliente9);
        cliente.add(cliente10);
        
        servico.add(servico1);
        servico.add(servico2);
        servico.add(servico3);
        servico.add(servico4);
        servico.add(servico5);
        servico.add(servico6);
        
        agendamento.add(agendamento1);
        agendamento.add(agendamento2);
        agendamento.add(agendamento3);
        
    }
    
    
}