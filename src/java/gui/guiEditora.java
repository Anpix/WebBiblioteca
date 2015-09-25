/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import dao.EditoraDao;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import model.Editora;

/**
 *
 * @author Anpix
 */
@ManagedBean
@SessionScoped
public class guiEditora {
    private Editora editora;
    private List<Editora> editoras;



    /**
     * Creates a new instance of guiEditora
     */
    public guiEditora(){
    }
    
    public String iniciar(){
        editoras = EditoraDao.getEditoras();
        editora = new Editora();
        return "LstEditoras";
    }
    
    public String gravar(){
        EditoraDao.add(editora);
        editoras = EditoraDao.getEditoras();
        return "LstEditoras";
    }
    
    public String excluir(Editora editora){
        EditoraDao.remove(editora);
        return null;
    }
    
    
    
    

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }
    
    public List<Editora> getEditoras() {
        return editoras;
    }

    public void setEditoras(List<Editora> editoras) {
        this.editoras = editoras;
    }
    
    public String incluirEditora(){
        editora = new Editora();
        return "CadEditora";
    }
}
