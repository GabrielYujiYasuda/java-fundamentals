package poo.heranca.desafio.test;

import poo.heranca.desafio.Carro;
import poo.heranca.desafio.Ferrari;
import poo.heranca.desafio.Fiat;

public class CarroTest {
    public static void main(String[] args) {

        Ferrari ferrari = new Ferrari();
        Fiat fiat = new Fiat();

        System.out.println("Ferrari: " + ferrari.acelerar());
        System.out.println("Fiat: " + fiat.acelerar());

//        System.out.println("Carro: " + carro.frear());
//        System.out.println("Ferrari: " + ferrari.frear());
//        System.out.println("Fiat: " + fiat.frear());

    }
}
