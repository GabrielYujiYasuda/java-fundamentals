package strings;

public class Strings05 {
    public static void main(String[] args) {
        //SUBSTRING
        //TRIM
        //REPLACE
        //REPLACE ALL

        String teste = "Isso e um teste!";

        System.out.println(teste);
        System.out.println(teste.substring(10));
        System.out.println(teste.substring(10, 15));

        System.out.println();

        String espacos = "i s p a c o";
        String semEspacos = espacos.replace('i', 'e');
        System.out.println(semEspacos);

        semEspacos = semEspacos.replaceAll(" ", "");
        System.out.println(semEspacos);

        String nome = " meu nome eh: ";
        System.out.println(nome);
        System.out.println(nome.trim());

    }
}
