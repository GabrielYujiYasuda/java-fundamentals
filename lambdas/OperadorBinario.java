package lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class OperadorBinario {
    public static void main(String[] args) {

        BinaryOperator<Double> media =
                (Double n1,Double n2) ->
                        (n1 + n2) / 2;

        BiFunction<Double, Double, String> media2 =
                (n1, n2) -> ((n1 + n2) / 2) >= 7
                        ?"Aprovado"
                        : "Reprovado";

        System.out.println(media2.apply(0.0, 10.0));
    }
}
