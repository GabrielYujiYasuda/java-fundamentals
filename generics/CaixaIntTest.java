package generics;

public class CaixaIntTest {
    public static void main(String[] args) {

        CaixaInt<String> caixaA = new CaixaInt<>();
        caixaA.guardar(123);

        Integer coisaA = (Integer) caixaA.retirar();
        System.out.println(coisaA);

    }
}
