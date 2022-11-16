package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {
    public static void main(String[] args) {

        Consumer <Object> print = System.out::println;

        Stream <String> langs = Stream.of("Java",
                "Lua", "JS\n");

        langs.forEach(print);

        String[] maisLang = {"Phyton", "Lisp", "Perl",
        "Go\n"};

        Stream.of(maisLang).forEach(print);

        //==============================
        Arrays.stream(maisLang).forEach(print);
        Arrays.stream(maisLang, 0, 2)
                .forEach(print);

        System.out.println();

        //==============================
        List <String> outrasLangs = Arrays.asList("C", "php",
                "Kotlin\n");

        outrasLangs.forEach(print);
        outrasLangs.parallelStream().forEach(print);

        //==============================
        //Stream.generate(() -> "a").forEach(print);



        //Stream.iterate(0, n -> n + 1).forEach(print);
    }
}
