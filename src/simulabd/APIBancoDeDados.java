/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package simulabd;

/**
 *
 * @author philippe.kpsales
 */
public interface APIBancoDeDados {
    
    public boolean insert(String nome, String senha, String funcao);
    public Funcionario select (Funcionario ze);
    
    public Funcionario select(String nome);
}
