package strings;

public class Strings02 {
    public static void main(String[] args) {
        //STRING METHOD

        String java = "Java";

        for (int i = 0; i < java.length(); i++) {
            System.out.println(java.charAt(i));
        }

        char[] chars = new char[java.length()];

        java.getChars(0, 3, chars, 0);
        System.out.println(chars);

        char[] javaChars = java.toCharArray();
        System.out.println(javaChars);
    }
}
