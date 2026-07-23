import java.util.ArrayList;

// Classe principal, responsável por cadastrar os personagens e simular suas habilidades
public class Main {

    public static void main(String[] args) {

        // Criando a lista de personagens (aplica polimorfismo: a lista guarda a superclasse,
        // mas cada elemento pode ser um Mago ou um Guerreiro)
        ArrayList<Personagem> personagens = new ArrayList<>();

        // Adicionando dois magos à lista
        personagens.add(new Mago("Eldoran", 7, 60, 18.0));
        personagens.add(new Mago("Lyriel", 6, 55, 16.5));

        // Adicionando dois guerreiros à lista
        personagens.add(new Guerreiro("Arthus", 8, 130, 20.0));
        personagens.add(new Guerreiro("Draven", 5, 110, 15.0));

        // Percorrendo a lista com um laço (permitido apenas aqui, no main)
        for (Personagem personagem : personagens) {
            // Exibe os dados básicos do personagem
            personagem.exibirStatus();

            // Chama a habilidade específica de cada personagem (vinculação dinâmica)
            personagem.usarHabilidade();

            System.out.println("-----------------------------");
        }
    }
}
