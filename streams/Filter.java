package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {
    public static void main(String[] args) {

        Aluno aluno01 = new Aluno("Ana",
                7.8, true);
        Aluno aluno02 = new Aluno("Bia",
                5.8, true);
        Aluno aluno03 = new Aluno("Daniel",
                9.8, false);
        Aluno aluno04 = new Aluno("Gui",
                6.8, true);
        Aluno aluno05 = new Aluno("Rebeca",
                7.1, false);
        Aluno aluno06 = new Aluno("Pedro",
                8.8, true);

        List<Aluno> alunos = Arrays.asList(aluno01,
                aluno02, aluno03, aluno04, aluno05, aluno06);

        Consumer<String> printer = System.out::println;

        Predicate<Aluno> aprovado = a -> a.nota >= 7;

        Function<Aluno, String> mensagemAprovacao = a -> "Parabens "
                + a.nome + ". Voce foi aprovado(a)!";

        alunos.stream()
                .filter(aprovado)
                .map(mensagemAprovacao)
                .forEach(printer);

    }
}
