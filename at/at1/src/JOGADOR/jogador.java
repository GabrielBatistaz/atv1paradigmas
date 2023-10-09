import java.util.Scanner;

public class Jogador {
    private String nome;
    private int idade;
    private String tronco;
    private String pernaDireita;
    private String pernaEsquerda;
    private String cabeca;
    private String endereco;

    public Jogador(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    public void corra() {
        System.out.println(nome + " está correndo.");
    }
    public void salte() {
        System.out.println(nome + " está saltando.");
    }
    public void chute() {
        System.out.println(nome + " está chutando.");
    }
    public void leiaNome() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do jogador: ");
        nome = scanner.nextLine();
    }
    public void crieCabeça(String tipoCabeça) {
        this.cabeca = tipoCabeça;
    }
    public void crieTronco(String tipoTronco) {
        this.tronco = tipoTronco;
    }
    public void criePernaDireita(String tipoPernaDireita) {
        this.pernaDireita = tipoPernaDireita;
    }
    public void criePernaEsquerda(String tipoPernaEsquerda) {
        this.pernaEsquerda = tipoPernaEsquerda;
    }
}