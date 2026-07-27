import java.util.Objects;

// Superclasse abstrata que define as características e o comportamento comum a todo personagem de Eldoria
public abstract class Personagem {

    // Atributos encapsulados (privados), acessados apenas por getters e setters
    private String nome;
    private String classe;
    private int nivel;
    private int pontosDeVida;
    private double poderBase;

    // Construtor que inicializa todos os atributos do personagem
    public Personagem(String nome, String classe, int nivel, int pontosDeVida, double poderBase) {
        this.nome = nome;
        this.classe = classe;
        setNivel(nivel);
        setPontosDeVida(pontosDeVida);
        this.poderBase = poderBase;
    }

    // Getters: acesso controlado aos atributos privados
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

    // Setters com validação. Math.max garante que o valor nunca fique negativo,
    // sem a necessidade de uma estrutura de decisão (if/switch)
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public void setNivel(int nivel) {
        this.nivel = Math.max(nivel, 0);
    }

    public void setPontosDeVida(int pontosDeVida) {
        this.pontosDeVida = Math.max(pontosDeVida, 0);
    }

    public void setPoderBase(double poderBase) {
        this.poderBase = Math.max(poderBase, 0);
    }

    // Método abstrato: cada subclasse implementa sua própria habilidade,
    // demonstrando a vinculação dinâmica (polimorfismo)
    public abstract void usarHabilidade();

    // toString() exibe todos os atributos do personagem de forma legível
    @Override
    public String toString() {
        return "Nome: " + nome
                + "\nClasse: " + classe
                + "\nNível: " + nivel
                + "\nPontos de Vida: " + pontosDeVida
                + "\nPoder Base: " + poderBase;
    }

    // equals() considera dois personagens iguais quando nome e classe coincidem.
    // A verificação de tipo é feita com instanceof e ternário, evitando if/switch.
    @Override
    public boolean equals(Object obj) {
        boolean mesmoTipo = obj instanceof Personagem;
        Personagem outro = mesmoTipo ? (Personagem) obj : null;
        return mesmoTipo
                && Objects.equals(this.nome, outro.nome)
                && Objects.equals(this.classe, outro.classe);
    }

    // hashCode() consistente com equals(): baseado nos mesmos atributos (nome e classe)
    @Override
    public int hashCode() {
        return Objects.hash(nome, classe);
    }
}
