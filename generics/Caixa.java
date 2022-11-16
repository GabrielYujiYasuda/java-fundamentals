package generics;

public class Caixa<T> {

    private T coisa;

    public Object retirar() {
        return coisa;
    }

    public void guardar(T coisa) {
        this.coisa = coisa;
    }

}
