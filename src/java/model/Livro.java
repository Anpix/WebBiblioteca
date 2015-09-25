package model;

// @author Anpix

import java.util.Collection;


public class Livro {
    private String isbn;
    private String nome;
    private Collection<Copia> copia;
    private Collection<Autor> autores;
    private Editora editora;

    public Livro(String isbn, String nome, Copia copia) {
        this.isbn = isbn;
        this.nome = nome;
        this.copia.add(copia);
    }

    public Livro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    @Override
    public String toString() {
        return "Livro{" + "isbn=" + isbn + ", nome=" + nome + ", cópias=" + copia.size() + ", editora=" + editora.getNome() + "}";
    }
    
    
    
    
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Collection<Copia> getCopia() {
        return copia;
    }

    public void setCopia(Collection<Copia> copia) {
        this.copia = copia;
    }

    public Collection<Autor> getAutores() {
        return autores;
    }

    public void setAutores(Collection<Autor> autores) {
        this.autores = autores;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }
}
