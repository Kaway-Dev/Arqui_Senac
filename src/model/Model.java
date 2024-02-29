/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import simulabd.Funcionario;
import java.util.ArrayList;
import mvc.BancoDeDados;

/**
 *
 * @author philippe.kpsales
 */
public class Model implements APIModel {
    
    private static BancoDeDados  BD = new BancoDeDados();

    @Override
    public boolean insert(Funcionario ze) {
        return BD.insert(ze);
    }

    @Override
    public Funcionario select(String nome) {
        return BD.select(nome);
    }

    @Override
    public ArrayList<Funcionario> list() {
        return BD.list();
    }
    
}
