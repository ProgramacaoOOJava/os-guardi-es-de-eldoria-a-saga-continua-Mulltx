// Subclasse que representa um personagem do tipo Mago
public class Mago extends Personagem {

    // Construtor que usa super() para inicializar os dados herdados da superclasse
    public Mago(String nome, int nivel, int pontosDeVida, double poderBase) {
        super(nome, "Mago", nivel, pontosDeVida, poderBase);
    }

    // Implementação específica da habilidade do Mago
    @Override
    public void usarHabilidade() {
        System.out.println("Habilidade: " + getNome() + " conjura uma bola de fogo!");
    }
}
