/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import simulabd.Funcionario;

/**
 *
 * @author philippe.kpsales
 */
public class Controller implements APIController {

    @Override
    public boolean validaLogin(Funcionario entrada, Funcionario salvo) {
       return true;
    }

    @Override
    public ArrayList<Funcionario> listaUsers() {
       return null;
    }

    @Override
    public boolean criaUsers(Funcionario ze) {
        return true;
    }

    @Override
    public String cumprimenta() {
        return "";
    }
    
}
