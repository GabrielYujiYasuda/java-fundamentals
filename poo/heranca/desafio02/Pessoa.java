package poo.heranca.desafio02;

public class Pessoa {

    private double peso;

    //Constructor
    public Pessoa(double peso) {
        setPeso(peso);
    }

    public void comer(Comida comida) {
        this.peso += comida.getPeso();
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getPeso() {
        return peso;
    }
}
