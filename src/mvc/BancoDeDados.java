/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvc;

import simulabd.Funcionario;
import simulabd.APIBancoDeDados;
import java.util.ArrayList;


/**
 *
 * @author philippe.kpsales
 */


public class BancoDeDados implements APIBancoDeDados {
    
    ArrayList<Funcionario> BD;
    
    public BancoDeDados() {
        BD =  new ArrayList();
    }
    
    @Override
    public boolean insert(String nome, String senha, String funcao) {
        Funcionario aux = new Funcionario(nome, senha, funcao);
        return BD.add(aux);
    } 
    
    public boolean insert (Funcionario ze) {
        return BD.add(ze);
    }
    
    @Override
    public Funcionario select(String nome) {
        for(Funcionario t : this.BD) {
            if (t.getNome().equals(nome)){
            return t;
            }
        }
        return null;       
    }
    
    public ArrayList<Funcionario> list() {
      return this.BD; 
    }

    @Override
    public Funcionario select(Funcionario ze) {
        throw new RuntimeException("Refatorar esse código aqui");
    }
}
