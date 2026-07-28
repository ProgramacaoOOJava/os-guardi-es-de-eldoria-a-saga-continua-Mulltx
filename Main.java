import java.util.ArrayList;

// Classe principal, responsável por cadastrar os personagens, executar suas habilidades
// e demonstrar casting explícito, instanceof e a interface Auditavel
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

        // Percorrendo a lista com um laço for (permitido apenas no main)
        for (Personagem personagem : personagens) {

            // Exibe o status atual do personagem
            personagem.exibirStatus();

            // Chama a habilidade específica de cada personagem (vinculação dinâmica)
            personagem.usarHabilidade();

            // Usa instanceof para identificar se o personagem é um Mago (o if é permitido aqui, pois estamos no main)
            if (personagem instanceof Mago) {

                // Registra uma ação diretamente no Mago
                Mago mago = (Mago) personagem;
                mago.registrarAcao("Conjurou bola de fogo");

                // Casting explícito para a interface Auditavel, chamando seu contrato
                Auditavel auditavel = (Auditavel) personagem;
                auditavel.auditarAcoes();
            }

            // Casting explícito para Personagem, invocando o método protegido atribuirBencao()
            ((Personagem) personagem).atribuirBencao(2.0);

            // Exibe o status novamente, já com o poder base atualizado pela bênção
            System.out.println("Novo poder base após bênção: " + personagem.getPoderBase());

            System.out.println("-----------------------------");
        }
    }
}
