package poo.heranca.desafio;

public class Ferrari extends Carro {


    public Ferrari() {
        super(300);
    }

    @Override
    public int acelerar() {
        return velocidade += 50;
    }

    @Override
    public int frear() {
        return velocidade -= 50;
    }
}
