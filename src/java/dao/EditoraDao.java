// @author Anpix

package dao;

import java.util.ArrayList;
import java.util.List;
import model.Editora;

public class EditoraDao {
    public static List<Editora> editoras = new ArrayList();
    
    public static List<Editora> getEditoras(){
        return editoras;
    }
    
    public static void add(Editora editora){
        editoras.add(editora);
    }
    
    public static void remove(Editora editora){
        editoras.remove(editora);
    }
}
