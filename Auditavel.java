// Interface que define o contrato para personagens capazes de registrar e auditar suas ações
public interface Auditavel {

    // Registra uma nova ação realizada pelo personagem
    void registrarAcao(String acao);

    // Exibe todas as ações registradas até o momento
    void auditarAcoes();
}
