package model;

// @author Anpix

import java.util.Calendar;


public class Emprestimo {
    private Calendar dataEmprestimo;
    private Calendar dataPrevistaDevolucao;
    private Calendar dataDevolucao;
    private Usuario usuario;
    private Copia copia;
    
    public Emprestimo(Copia copia, Usuario usuario){
        this.copia = copia;
        this.usuario = usuario;
    }

    public Calendar getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(Calendar dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public Calendar getDataPrevistaDevolucao() {
        return dataPrevistaDevolucao;
    }

    public void setDataPrevistaDevolucao(Calendar dataPrevistaDevolucao) {
        this.dataPrevistaDevolucao = dataPrevistaDevolucao;
    }

    public Calendar getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Calendar dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }
    
    
    
    
    
    
    
    
}
