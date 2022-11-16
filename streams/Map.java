package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {
    public static void main(String[] args) {

        Consumer<String> print = System.out::println;

        List<String> marcas = Arrays.asList("BWM",
                 "Audi", "Honda");

        //marcas.stream().map(m -> m.toUpperCase())
         //.forEach(print);

        marcas.stream().map(String::toUpperCase)
                .forEach(print);

        UnaryOperator<String> maiscula =
                String::toUpperCase;

        UnaryOperator<String> minuscula =
                String::toLowerCase;

        UnaryOperator<String> primeiraLetra =
                n -> String.valueOf(n.charAt(0));

        UnaryOperator<String> grito = g -> g + "!!!";

        String test = maiscula
                .andThen(primeiraLetra)
                .andThen(grito)
                .apply("BMW");

        System.out.println("--------");

        marcas.stream()
                .map(Utilitarios.primeiraLetra)
                .map(Utilitarios.maiscula)
                .map(Utilitarios::grito)
                .forEach(print);

        marcas.stream()
                .map(primeiraLetra)
                .map(minuscula)
                .map(grito).forEach(print);
        marcas.stream().map(minuscula).forEach(print);

    }
}
