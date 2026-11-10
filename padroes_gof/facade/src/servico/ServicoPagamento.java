package servico;

import java.math.BigDecimal;
import modelo.DadosCliente;

/** Simulacao de pagamento: nao realiza cobrancas reais. */
public class ServicoPagamento {

    public void processarPagamento(DadosCliente cliente, BigDecimal valorTotal) {
        if (valorTotal == null || valorTotal.signum() <= 0) {
            throw new IllegalArgumentException("O valor total deve ser positivo.");
        }
        System.out.println("Pagamento: cobranca simulada de BRL " + valorTotal.toPlainString()
                + " aprovada para " + cliente.getNome() + ".");
    }
}
