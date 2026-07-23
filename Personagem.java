// Superclasse abstrata que define as características e o comportamento comum a todo personagem de Eldoria
public abstract class Personagem {

    // Atributos encapsulados (privados), acessados apenas por getters
    private String nome;
    private String classe;
    private int nivel;
    private int pontosDeVida;
    private double poderBase;

    // Construtor que inicializa todos os atributos do personagem
    public Personagem(String nome, String classe, int nivel, int pontosDeVida, double poderBase) {
        this.nome = nome;
        this.classe = classe;
        this.nivel = nivel;
        this.pontosDeVida = pontosDeVida;
        this.poderBase = poderBase;
    }

    // Getters: forma correta de acessar os atributos privados de fora da classe
    public String getNome() {
        return nome;
    }

    public String getClasse() {
        return classe;
    }

    public int getNivel() {
        return nivel;
    }

    public int getPontosDeVida() {
        return pontosDeVida;
    }

    public double getPoderBase() {
        return poderBase;
    }

    // Método concreto reaproveitado por todas as subclasses, exibe os dados do personagem com formatação clara
    public void exibirStatus() {
        System.out.println("Nome: " + nome);
        System.out.println("Classe: " + classe);
        System.out.println("Nível: " + nivel);
        System.out.println("Pontos de Vida: " + pontosDeVida);
        System.out.println("Poder Base: " + poderBase);
    }

    // Método abstrato: cada subclasse implementa sua própria habilidade,
    // demonstrando a vinculação dinâmica (polimorfismo)
    public abstract void usarHabilidade();
}
