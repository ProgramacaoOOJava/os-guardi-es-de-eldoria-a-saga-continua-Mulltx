// Subclasse que representa um personagem do tipo Guerreiro
public class Guerreiro extends Personagem {

    // Construtor que usa super() para inicializar os dados herdados da superclasse
    public Guerreiro(String nome, int nivel, int pontosDeVida, double poderBase) {
        super(nome, "Guerreiro", nivel, pontosDeVida, poderBase);
    }

    // Implementação específica da habilidade do Guerreiro
    @Override
    public void usarHabilidade() {
        System.out.println("Habilidade: " + getNome() + " desfere um golpe devastador com sua espada!");
    }
}
