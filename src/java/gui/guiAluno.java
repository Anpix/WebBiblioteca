/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import data.BdAlunos;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import model.Aluno;

/**
 *
 * @author Anpix
 */
@ManagedBean
@SessionScoped
public class guiAluno {
    private Aluno aluno;
    private List<Aluno> alunos;
    /**
     * Creates a new instance of guiAluno
     */
    public guiAluno() {
    }

    public String Iniciar(){
        alunos = BdAlunos.getAlunos();
        aluno = new Aluno(1,"a","b","c");
        return "frmLstAlunos";
    }
    
    
    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
    
}
