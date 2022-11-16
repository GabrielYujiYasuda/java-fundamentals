package poo;

import java.util.ArrayList;

public class Compra {

    String nomeCliente;

    ArrayList<Item> itens = new ArrayList<>();

    double obterValorTotal() {
        double total = 0;

        for (Item i: itens) {
            total += i.quantidade * i.preco;
        }

        return total;
    }
}
