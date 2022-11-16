package poo;

public class CompraTest {
    public static void main(String[] args) {

        Compra c1 = new Compra();
        c1.nomeCliente = "João Pedro";

        c1.itens.add(new Item("Notebook", 1, 3999));
        c1.itens.add(new Item("Caderno", 3, 18.39));
        c1.itens.add(new Item("Teclado", 1, 199.99));

        System.out.println(c1.itens.size());
        System.out.println(c1.obterValorTotal());

    }
}
