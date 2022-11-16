package poo.heranca;

public class Jogador {
    int vida = 100;
    int x;
    int y;

    public boolean atacar(Jogador oponente) {
        int deltaX = Math.abs(x - oponente.x);
        int deltaY = Math.abs(y - oponente.y);

        if (deltaX == 0 && deltaY == 1) {
            oponente.vida -= 10;
            return true;
        } else if (deltaX == 1 && deltaY == 0) {
            oponente.vida -= 10;
            return true;
        } else {
            return false;
        }

    }

    public boolean andar(Direcao direcao) {
        switch (direcao) {
            case SUL -> y++;
            case NORTE -> y--;
            case LESTE -> x++;
            case OESTE -> x--;
        }
    return true;
    }

}
