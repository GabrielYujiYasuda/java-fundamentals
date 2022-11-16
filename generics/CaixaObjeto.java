package generics;

public class CaixaObjeto {

    private Object coisa;

    public Object retirar() {
        return coisa;
    }

    public void guardar(Object coisa) {
        this.coisa = coisa;
    }
}
