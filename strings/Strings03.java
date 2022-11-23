package strings;

public class Strings03 {
    public static void main(String[] args) {
        //EQUALS
        //EQUALS IGNORE CASE
        //REGION MATCHES
        //COMPARE TO


        String ola1 = "Olá";
        String ola2 = "OLÁ";
        String ola3 = "Olá";

        System.out.println("Ola1 equqlas ola2: " + ola1.equals(ola2));
        System.out.println("Ola1 equqlas ola3: " + ola1.equals(ola3));

        System.out.println("Ola1 equqlas ola2: " + ola1.equalsIgnoreCase(ola2));

        // -----------------------

        String banana = "banana";
        String ana = "ana";
        String ban = "ban";

        System.out.println(banana.regionMatches(1, ana, 0, 3));

        // -----------------------

        String a = "a";
        String b = "b";
        String aMaiusc = "A";

        System.out.println(a.compareTo(b));
        System.out.println(b.compareTo(a));
        System.out.println(a.compareTo("a"));
        System.out.println(a.compareTo("A"));
        //-1 quando a > b
        //0 quando a == b
        //1 quando b > a

    }
}
