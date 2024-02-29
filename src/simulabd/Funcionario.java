/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulabd;

/**
 *
 * @author philippe.kpsales
 */
public class Funcionario {
    
    private String nome;
    private String senha;
    private String funcao;
    
    public Funcionario(String nome, String senha, String funcao) {
        this.nome = nome;
        this.senha = senha;
        this.funcao = funcao;
    }
    
    public Funcionario(){};

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    } 
}
