// @author Anpix

package dao;

import java.util.ArrayList;
import java.util.List;
import model.Autor;

public class AutorDao {
    public static List<Autor> autores = new ArrayList();
    
    public static List<Autor> getAutores(){
        return autores;
    }
    
    public static void add(Autor autor){
        autores.add(autor);
    }
    
    public static void remove(Autor autor){
        autores.remove(autor);
    }
}
