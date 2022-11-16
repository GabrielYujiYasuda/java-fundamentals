package poo;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

    final String aluno;
    List<Curso> cursosList = new ArrayList<>();

    Aluno(String aluno) {
        this.aluno = aluno;
    }

    void adicionarCurso(Curso curso) {
        this.cursosList.add(curso);
        curso.alunosList.add(this);
    }

}
