package pagamento;

/** Target (Alvo): contrato que o e-commerce utiliza para processar pagamentos. */
public interface ProcessadorPagamento {

    void processarPagamento(double valor, String numeroCartao);
}
