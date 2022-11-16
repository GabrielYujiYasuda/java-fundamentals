package generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaUtilTest {
    public static void main(String[] args) {

        //Sem generics
        List<String> langs = Arrays.asList("JS", "PHP", "Java", "C++");
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);

        String ultimaLingua1 = (String) ListaUtil.getUltimo1(langs);
        System.out.println(ultimaLingua1);

        Integer ultimoNum1 = (Integer) ListaUtil.getUltimo1(nums);
        System.out.println(ultimoNum1);

        //Utilizando generics
        String ultimaLingua2 = ListaUtil.getUltimo2(langs);
        System.out.println(ultimaLingua1);

        Integer ultimoNum2 = ListaUtil.getUltimo2(nums);
        System.out.println(ultimoNum1);
    }
}
