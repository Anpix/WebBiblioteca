/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import dao.LivroDao;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import model.Livro;

/**
 *
 * @author Anpix
 */
@ManagedBean
@SessionScoped
public class guiLivro {
    private Livro livro;
    private List<Livro> livros;



    /**
     * Creates a new instance of guiEditora
     */
    public guiLivro(){
    }
    
    public String iniciar(){
        livros = LivroDao.getLivros();
        livro = new Livro();
        return "LstLivros";
    }
    
    public String gravar(){
        LivroDao.add(livro);
        livros = LivroDao.getLivros();
        return "LstLivros";
    }
    
    public String excluir(Livro livro){
        LivroDao.remove(livro);
        return null;
    }
    
    
    
    

    public Livro getLivro() {
        return livro;
    }

    public void setAutor(Livro livro) {
        this.livro = livro;
    }
    
    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }
    
    public String incluirAutor(){
        livro = new Livro();
        return "CadLivro";
    }
}
