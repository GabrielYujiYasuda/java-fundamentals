package poo.heranca.desafio;

public abstract class Carro {

    final int VELOCIDADE_MAX;

    int velocidade;

    protected Carro(int velocidadeMaxima) {
        VELOCIDADE_MAX = velocidadeMaxima;
    }

    protected int acelerar() {
        return  velocidade += 10;
    }
    protected int frear() {
        return  velocidade -= 10;
    }
}
