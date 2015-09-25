// @author Anpix

package dao;

import java.util.ArrayList;
import java.util.List;
import model.Livro;

public class LivroDao {
    public static List<Livro> livros = new ArrayList();
    
    public static List<Livro> getLivros(){
        return livros;
    }
    
    public static void add(Livro livro){
        livros.add(livro);
    }
    
    public static void remove(Livro livro){
        livros.remove(livro);
    }
}
