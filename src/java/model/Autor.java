package model;

// @author Anpix

public class Autor {
    private String nome;
    private String sobrenome;

    public Autor(String nome, String sobreNome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public Autor() {
        
    }

    @Override
    public String toString() {
        return "Autor{" + nome + " " + sobrenome + '}';
    }
    
    
    
    
    
    
    
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    
    
}
