package poo.heranca.desafio;

public class Fiat extends Carro {

    public Fiat() {
        super(180);
    }

    @Override
    public int acelerar() {
        return velocidade += 5;
    }

    @Override
    public int frear() {
        return velocidade -= 5;
    }
}
