package data;

// @author Anpix

import java.util.ArrayList;
import java.util.List;
import model.Aluno;

public abstract class BdAlunos {
    private static List<Aluno> alunos = new ArrayList();
    
    public static List<Aluno> getAlunos(){
        return alunos;
    }
    
    public static void gravar(Aluno aluno){
        alunos.add(aluno);
    }
    
    public static void remover(Aluno aluno){
        alunos.remove(aluno);
    }
}
