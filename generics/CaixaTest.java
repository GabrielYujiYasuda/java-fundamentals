package generics;

public class CaixaTest {
    public static void main(String[] args) {

        Caixa<String> caixaA = new Caixa<>();
        caixaA.guardar("Trying generics!!!");

        String coisaA = (String) caixaA.retirar();
        System.out.println(coisaA);

        Caixa<Double> caixaB = new Caixa<>();
        caixaB.guardar(3.2);

        Double coisaB = (Double) caixaB.retirar();
        System.out.println(coisaB);
    }
}
