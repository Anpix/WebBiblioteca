/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Anpix
 */
public class Aluno extends Usuario {
    private Integer matricula;
    
    public Aluno(Integer matricula, String login, String senha, String nome) {
        super(login, senha, nome);
        this.matricula = matricula;
    }
    
    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    

    @Override
    public String toString() {
        return "Aluno{" + "nome=" + this.getNome() + ",matricula=" + matricula + '}';
    }
    
}
