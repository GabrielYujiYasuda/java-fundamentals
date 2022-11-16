package generics;

public class CaixaObjetoTest {
    public static void main(String[] args) {

        //Sem generics
        CaixaObjeto caixaA = new CaixaObjeto();
        caixaA.guardar(2.3);

        Double coisa = (Double) caixaA.retirar();
        System.out.println(coisa);

        //=====

        CaixaObjeto caixaB = new CaixaObjeto();
        caixaB.guardar("Ola");

        String coisaB = (String) caixaB.retirar();
        System.out.println(coisaB);
    }
}
