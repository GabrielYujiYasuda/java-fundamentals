package poo.heranca.desafio02;

public class Jantar {
    public static void main(String[] args) {

        Arroz arroz = new Arroz(0.2);
        Feijao feijao = new Feijao(0.3);
        Sorvete sorvete = new Sorvete(0.6);

        Pessoa p1 = new Pessoa(100.0);

        p1.comer(arroz);


        System.out.println(p1.getPeso());
    }
}
