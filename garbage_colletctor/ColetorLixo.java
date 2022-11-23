package garbage_colletctor;


//That is not how it is used in real life. Just learning methods
public class ColetorLixo {

    public static void obterMemoriaUsada() {
        final int MB = 1024 * 1024;

        Runtime runtime = Runtime.getRuntime(); //singleton

        System.out.println((runtime.totalMemory() - runtime.freeMemory()) / MB);
    }

    public static void main(String[] args) {

        Contato[] contatosArray = new Contato[1000];
        Contato contato;

        for (int i = 0; i < contatosArray.length; i++) {
            contato = new Contato("contato:"+i, "1234 1234"+i, "contato"+i+"@email.com");
            contatosArray[i] = contato;
        }

        System.out.println("Contatos criados");
        obterMemoriaUsada();

        contatosArray = null;

        Runtime.getRuntime().runFinalization();
        Runtime.getRuntime().gc();

        obterMemoriaUsada();

         System.out.println("Contatos deletados");
        obterMemoriaUsada();


    }
}
