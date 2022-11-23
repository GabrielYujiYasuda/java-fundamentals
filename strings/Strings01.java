package strings;

public class Strings01 {
    public static void main(String[] args) {

        String empty = new String(); // empty string
        String java = new String("JAVA");
        String java1 = new String(java);

        System.out.println(empty);
        System.out.println(java);
        System.out.println(java1);

        char[] charsJava = {'J', 'A', 'V', 'A'};
        String java2 = new String(charsJava);
        System.out.println(charsJava);

        char[] abc = {'A', 'B', 'C', 'D', 'E', 'F'};
        String abcdef = new String(abc, 0, 3);
        System.out.println(abcdef);

        byte[] abcde = {65, 66, 67, 68, 69};
        String letraByte = new String(abcde);
        System.out.println(letraByte);
    }
}
