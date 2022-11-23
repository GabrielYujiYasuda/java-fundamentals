package strings;

public class Pessoa {

    private int cod;
    private String nome;
    private int idade;

    //Constructors
    public Pessoa()
    {

    }
    public Pessoa(int cod, String nome, int idade) {
        this.cod = cod;
        this.nome = nome;
        this.idade = idade;
    }

    //Getters and Setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCod(int cod) {
        this.cod = cod;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }
    public int getCod() {
        return cod;
    }
    public int getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "cod=" + cod +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
