package streams;

import java.util.function.UnaryOperator;

public class Utilitarios {

    final static UnaryOperator<String> maiscula =
            String::toUpperCase;

    public final static UnaryOperator<String> minuscula =
            String::toLowerCase;

    public final static UnaryOperator<String> primeiraLetra =
            n -> String.valueOf(n.charAt(0));

    public static String grito(String x) {
        return x + "!!!";
    }

    public static String printar(String x) {
        return String.format("%s", x);
    }
}
