package exceptions;

public class ChecadaNaoChecada {
    public static void main(String[] args) {

        try {
            gerarErro01();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        gerarErro02();

//        try {
//            gerarErro02();
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//            //throw new RuntimeException(e);
//        }

        System.out.println("Fim!!!");
    }

    //Exceção não verificada
    static void gerarErro01() {
        throw new RuntimeException("Erro 01!!!");
    }

    //Exceção verificada
    static void gerarErro02() {
        try {
            throw new Exception("Erro 02!!!");
        } catch (Exception e) {
            System.out.println("Errou!");
        }

    }
}
