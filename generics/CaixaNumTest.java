package generics;

public class CaixaNumTest {
    public static void main(String[] args) {

        CaixaNum<Double> caixaA = new CaixaNum<>();
        caixaA.guardar(342.3);
        System.out.println(caixaA.retirar());

        CaixaNum<Integer> caixaB = new CaixaNum<>();
        caixaB.guardar(76);
        System.out.println(caixaB.retirar());
    }
}
