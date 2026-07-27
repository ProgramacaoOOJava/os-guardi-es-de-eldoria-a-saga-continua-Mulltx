import java.util.ArrayList;

// Classe principal, responsável por cadastrar os personagens e demonstrar
// toString, equals, hashCode e instanceof
public class Main {

    public static void main(String[] args) {

        // Criando a lista de personagens (aplica polimorfismo: a lista guarda a superclasse,
        // mas cada elemento pode ser um Mago ou um Guerreiro)
        ArrayList<Personagem> personagens = new ArrayList<>();

        // Adicionando dois magos à lista
        personagens.add(new Mago("Eldoran", 7, 60, 18.0));
        personagens.add(new Mago("Lyriel", 6, 55, 16.5));

        // Adicionando dois guerreiros à lista
        personagens.add(new Guerreiro("Arthemis", 5, 80, 12.5));
        personagens.add(new Guerreiro("Draven", 8, 130, 20.0));

        // Percorrendo a lista com um laço for (estrutura de repetição permitida apenas no main)
        for (Personagem personagem : personagens) {

            // toString() é chamado implicitamente pelo println, exibindo o status completo
            System.out.println(personagem);

            // Chama a habilidade específica de cada personagem (vinculação dinâmica)
            personagem.usarHabilidade();

            // Usa instanceof para identificar o tipo real do personagem em tempo de execução
            // e monta uma mensagem personalizada (o if é permitido aqui, pois estamos no main)
            String tipo = (personagem instanceof Mago) ? "Mago" : "Guerreiro";
            System.out.println("O personagem " + personagem.getNome() + " é um " + tipo
                    + " de nível " + personagem.getNivel() + ".");

            System.out.println("-----------------------------");
        }

        // Comparando dois personagens específicos da lista com equals()
        Personagem eldoran = personagens.get(0);
        Personagem arthemis = personagens.get(2);

        String resultadoComparacao = eldoran.equals(arthemis) ? "iguais" : "diferentes";
        System.out.println("Comparando, " + eldoran.getNome() + " e " + arthemis.getNome()
                + " são " + resultadoComparacao + ".");
    }
}
