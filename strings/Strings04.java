package strings;

public class Strings04 {
    public static void main(String[] args) {
        //INDEX OF
        //LAST INDEX OF
        //CONTAINS

        String banana = "banana";
        String ana = "ana";

        System.out.println("FIRST:");
        System.out.println(banana.indexOf("ana"));
        System.out.println(banana.indexOf("n"));
        //-1 quando não encontrado

        System.out.println("LAST:");
        System.out.println(banana.lastIndexOf(ana));
        System.out.println(banana.lastIndexOf("n"));
        System.out.println(banana.lastIndexOf("b"));

        System.out.println(banana.contains(ana));
        System.out.println(banana.contains("abna"));

    }
}
