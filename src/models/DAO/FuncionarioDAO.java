/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models.DAO;

import models.Funcionario;
import java.util.ArrayList;

/**
 *
 * @author tiago
 */
public class FuncionarioDAO {
    
    /**
     * Insere um funcionario dentro do banco de dados
     * @param funcionario exige que seja passado um objeto do tipo funcionario
     */
    public void insert(Funcionario funcionario){
        BancoDAO.funcionario.add(funcionario);
    }
    
    /**
     * Atualiza um Objeto no banco de dados
     * @param funcionario
     * @return 
     */
    public boolean update(Funcionario funcionario){
        
        for (int i = 0; i < BancoDAO.funcionario.size(); i++) {
            if(idSaoIguais(BancoDAO.funcionario.get(i),funcionario)){
                BancoDAO.funcionario.set(i, funcionario);
                return true;
            }
        }
        return false;      

    }
    
    /**
     * Deleta um objeto do banco de dados pelo id do funcionario passado
     * @param funcionario
     * @return 
     */
    public boolean delete(Funcionario funcionario){
        for (Funcionario funcionarioLista : BancoDAO.funcionario) {
            if(idSaoIguais(funcionarioLista,funcionario)){
                BancoDAO.funcionario.remove(funcionarioLista);
                return true;
            }
        }
        return false;
    }
    
    /**
     * Retorna um arraylist com todos os funcionarios do banco de dados
     * @return uma lista com todos os registros do banco
     */
    public ArrayList<Funcionario> selectAll(){
        return BancoDAO.funcionario;
    }
    
    /**
     * Retorna um Objeto do tipo funcionario se a funcao encontrar o funcionario passado como parâmetro no banco, para considerar sao usado nome e senha
     * @param funcionario
     * @return funcionario encontrado no banco de dados
     */
    public Funcionario selectPorNomeESenha(Funcionario funcionario){
        for (Funcionario funcionarioLista : BancoDAO.funcionario) {
            if(nomeESenhaSaoIguais(funcionarioLista,funcionario)){
                return funcionarioLista;
            }
        }
        return null;
    }

    /**
     * Recebe dois objetos e verifica se são iguais verificando o nome e senha
     * @param funcionario
     * @param funcionarioAPesquisar
     * @return verdadeiro caso sejam iguais e falso caso nao forem iguais
     */
    private boolean nomeESenhaSaoIguais(Funcionario funcionario, Funcionario funcionarioAPesquisar) {
        return funcionario.getNome().equals(funcionarioAPesquisar.getNome()) && funcionario.getSenha().equals(funcionarioAPesquisar.getSenha());
    }

    /**
     * Compara se dois objetos tem a propriedade id igual
     * @param funcionario
     * @param funcionarioAComparar
     * @return verdadeiro caso os id forem iguais e falso se nao forem
     */
    private boolean idSaoIguais(Funcionario funcionario, Funcionario funcionarioAComparar) {
        return funcionario.getId() ==  funcionarioAComparar.getId();
    }
    
    
    
}

