import java.util.ArrayList;
import java.util.Scanner;

public class Appjogador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Jogador> jogadores = new ArrayList<>();

        Jogador dida = new Jogador("Dida", 42);
        dida.crieCabeça("Cabeça Padrão");
        dida.crieTronco("Tronco Padrão");
        dida.criePernaDireita("Perna Direita Padrão");
        dida.criePernaEsquerda("Perna Esquerda Padrão");

        Jogador ronaldo = new Jogador("Ronaldo", 45);
        ronaldo.crieCabeça("Cabeça Personalizada");
        ronaldo.crieTronco("Tronco Padrão");
        ronaldo.criePernaDireita("Perna Direita Padrão");
        ronaldo.criePernaEsquerda("Perna Esquerda Personalizada");

        Jogador juninho = new Jogador("Juninho", 41);
        juninho.crieCabeça("Cabeça Padrão");
        juninho.crieTronco("Tronco Padrão");
        juninho.criePernaDireita("Perna Direita Personalizada");
        juninho.criePernaEsquerda("Perna Esquerda Padrão");

        jogadores.add(dida);
        jogadores.add(ronaldo);
        jogadores.add(juninho);

        System.out.print("Digite o nome do jogador para ver suas características: ");
        String nomeBusca = scanner.nextLine();

        for (Jogador jogador : jogadores) {
            if (jogador.getNome().equalsIgnoreCase(nomeBusca)) {
                System.out.println("Informações do Jogador:");
                System.out.println("Nome: " + jogador.getNome());
                System.out.println("Idade: " + jogador.getIdade());
                System.out.println("Cabeça: " + jogador.getCabeca());
                System.out.println("Tronco: " + jogador.getTronco());
                System.out.println("Perna Direita: " + jogador.getPernaDireita());
                System.out.println("Perna Esquerda: " + jogador.getPernaEsquerda());
                break;
            }
        }
    }
}