package exceptions;

public class Basico {
    public static void main(String[] args) {

     Aluno a1 = null;

     try {
         imprimirAluno(a1);
     } catch (Exception e ) {
         e.printStackTrace();
         System.out.println("Ocorreu um erro no momento" +
                 "de imprimir o nome do usuario!");
     }


     try {
         System.out.println(7 / 0);
     } catch (ArithmeticException e) {
         System.out.println("Ocorreu um erro: " +
                 e.getMessage());
         e.printStackTrace();
     }

     System.out.println("Fim");

    }

    static void imprimirAluno(Aluno aluno) {
        System.out.println(aluno.getNome());
    }
}
