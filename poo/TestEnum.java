package poo;

import poo.heranca.Direcao;

public class TestEnum {
    public static void main(String[] args) {

        DiaSemana dia = DiaSemana.DOMINGO;

        System.out.println(dia.toString() + " - " + dia.getValor());
    }
}
