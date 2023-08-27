/*
Arthur Socrates Saavedra Lemos
2° Informatica
 */
public class Classe_Construtora {
    private String nome;
    private int idade;

    // Construtor
    public Classe_Construtora(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Métodos getter e setter para nome
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Métodos getter e setter para idade
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public static void main(String[] args) {
        Classe_Construtora pessoa1 = new Classe_Construtora("João", 30);
        Classe_Construtora pessoa2 = new Classe_Construtora("Maria", 25);

        System.out.println("Pessoa 1 - Nome: " + pessoa1.getNome() + ", Idade: " + pessoa1.getIdade());
        System.out.println("Pessoa 2 - Nome: " + pessoa2.getNome() + ", Idade: " + pessoa2.getIdade());
    }
}
