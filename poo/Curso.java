package poo;

import java.util.ArrayList;
import java.util.List;

public class Curso {

    final String curso;
    List<Aluno> alunosList = new ArrayList<>();

    Curso(String curso) {
        this.curso = curso;
    }

    void adicionarAluno(Aluno aluno) {
        this.alunosList.add(aluno);
        aluno.cursosList.add(this);
    }

}
