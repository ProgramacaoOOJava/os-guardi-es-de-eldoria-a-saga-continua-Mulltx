import java.util.ArrayList;

// Subclasse que representa um personagem do tipo Mago.
// É a única subclasse que implementa a interface Auditavel, registrando suas ações.
public class Mago extends Personagem implements Auditavel {

    // Lista que guarda o histórico de ações realizadas pelo Mago
    private ArrayList<String> acoes;

    // Construtor que usa super() para inicializar os dados herdados da superclasse
    public Mago(String nome, int nivel, int pontosDeVida, double poderBase) {
        super(nome, "Mago", nivel, pontosDeVida, poderBase);
        this.acoes = new ArrayList<>();
    }

    // Implementação específica da habilidade do Mago
    @Override
    public void usarHabilidade() {
        System.out.println("Habilidade: " + getNome() + " conjura uma bola de fogo!");
    }

    // Adiciona uma nova ação ao histórico do Mago
    @Override
    public void registrarAcao(String acao) {
        acoes.add(acao);
    }

    // Exibe todas as ações registradas pelo Mago
    @Override
    public void auditarAcoes() {
        System.out.println("Ações auditadas:");
        for (String acao : acoes) {
            System.out.println("- " + acao);
        }
    }
}
