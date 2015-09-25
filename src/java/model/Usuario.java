/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;

/**
 *
 * @author Anpix
 */
public abstract class Usuario implements Autenticacao{
    private static List<Usuario> usuarios;
    private String login;
    private String senha;
    private String nome;
    
    public Usuario(String login, String senha, String nome) {
        this.login = login;
        this.senha = senha;
        this.nome = nome;
    }

    @Override
    public void logar(String login, String senha) throws Exception{
        Integer verify = 0;
        for (Usuario u: usuarios) {
            if (u.login == login){
                verify = 1;
                if (u.senha == senha){
                    verify = 2;
                }
            }
        }
        if (verify == 0){
            throw new Exception("Não existe usuário");
        }else if(verify == 1 ){
            throw new Exception("Senha Incorreta");
        }
    }

    
    @Override
    public String toString() {
        return "Usuario{" + "login=" + login + ", senha=" + senha + ", nome=" + nome + '}';
    }
    
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
