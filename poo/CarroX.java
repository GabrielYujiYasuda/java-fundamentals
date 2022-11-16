package poo;

public class CarroX {

    Motor motor = new Motor();

    void ligar() {
        if (estaLigado() == false) {
            motor.ligado = true;
            System.out.println("VOCE LIGOU O CARRO!");
        } else
            System.out.println("Carro já esta ligado!");
    }

    void desligar() {
        if(estaLigado() == true) {
            motor.ligado = false;
            System.out.println("VOCE DESLIGOU O CARO!");
        } else {
            System.out.println("Carro já esta desligado!");
        }
    }

    boolean estaLigado() {
        return motor.ligado;
    }

    void acelerar() {
        if (estaLigado() == true) {
            motor.fatorInjecao += 0.4;
            System.out.println("ACELERANDO!!!");
        } else {
            System.out.println("Ligue o carro para acelerar");
        }
    }

    void frear() {
        if (estaLigado() == true) {
            motor.fatorInjecao -= 0.4;
            System.out.println("FREANDO!!!");
        } else {
            System.out.println("Ligue o carro para frear");
        }
    }
}
