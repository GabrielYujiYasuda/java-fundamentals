package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {
    public static void main(String[] args) {

        //PRINTER
        Consumer<Object> print = System.out::println;
        //ou x -> System.out.println(x);

        List<Integer> nums = Arrays.asList(1, 2, 3,
                4, 5, 6, 7, 8, 9);

        //Inverte posições da String
        UnaryOperator<String> inverter =
                s -> new StringBuilder(s)
                        .reverse().toString();

        //Converte String reversa para Integer
        Function<String, Integer> stringToInt =
                Integer::valueOf;
                // ou s -> Integer.parseInt(s);

        nums.stream()
                .map(Integer::toBinaryString) //Converte Int para binários
                .map(inverter)
                .map(stringToInt)
                .forEach(print);
    }
}
