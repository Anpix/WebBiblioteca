/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import dao.AutorDao;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import model.Autor;

/**
 *
 * @author Anpix
 */
@ManagedBean
@SessionScoped
public class guiAutor {
    private Autor autor;
    private List<Autor> autores;



    /**
     * Creates a new instance of guiEditora
     */
    public guiAutor(){
    }
    
    public String iniciar(){
        autores = AutorDao.getAutores();
        autor = new Autor();
        return "LstAutores";
    }
    
    public String gravar(){
        AutorDao.add(autor);
        autores = AutorDao.getAutores();
        return "LstAutores";
    }
    
    public String excluir(Autor autor){
        AutorDao.remove(autor);
        return null;
    }
    
    
    
    

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    
    public List<Autor> getAutores() {
        return autores;
    }

    public void setAutores(List<Autor> autores) {
        this.autores = autores;
    }
    
    public String incluirAutor(){
        autor = new Autor();
        return "CadAutor";
    }
}
