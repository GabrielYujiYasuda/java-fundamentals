package poo.heranca.desafio02;

import javax.print.DocFlavor;

public class Comida {

    private double peso;

    protected Comida(double peso) {
        setPeso(peso);
    }

    protected void setPeso(double peso) {
        if (peso >= 0) this.peso = peso;
    }
    protected double getPeso() {
        return peso;
    }
}
