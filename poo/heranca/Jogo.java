package poo.heranca;

public class Jogo {
    public static void main(String[] args) {

        Monstro m1 = new Monstro();
        m1.x = 10;
        m1.y = 10;

        Heroi h1 = new Heroi();
        h1.x = 10;
        h1.y = 11;

        m1.atacar(h1);
        m1.atacar(h1);
        h1.atacar(m1);
        h1.atacar(m1);

        System.out.println("Monstro1 vida: " + m1.vida);
        System.out.println("Heroi2 vida: " + h1.vida);

    }
}