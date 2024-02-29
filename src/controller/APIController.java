/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package controller;

import java.util.ArrayList;
import simulabd.Funcionario;

/**
 *
 * @author philippe.kpsales
 */
public interface APIController {
    
    public boolean validaLogin(Funcionario entrada, Funcionario salvo);
    
    public ArrayList<Funcionario> listaUsers();
    public boolean criaUsers(Funcionario ze);
    
    public String cumprimenta();
}
