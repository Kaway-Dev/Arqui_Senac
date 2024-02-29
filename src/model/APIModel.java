/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package model;

import java.util.ArrayList;
import simulabd.Funcionario;

/**
 *
 * @author philippe.kpsales
 */
public interface APIModel {
    public boolean insert(Funcionario ze);
    public Funcionario select (String nome);
    
    public ArrayList<Funcionario> list();
}
