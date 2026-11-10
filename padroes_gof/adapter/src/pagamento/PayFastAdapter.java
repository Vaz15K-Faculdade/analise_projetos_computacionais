package pagamento;

import java.math.BigDecimal;
import java.util.Objects;
import terceiro.PayFastService;

/**
 * Adapter (Adaptador): traduz o contrato ProcessadorPagamento para PayFastService.
 *
 * O Adapter de Objeto usa composicao: guarda uma instancia do servico adaptado.
 * O Adapter de Classe usa heranca: estende a classe que deseja adaptar.
 * A composicao e geralmente recomendada por reduzir o acoplamento e permitir
 * trocar o servico recebido, sem depender da heranca unica de classes do Java.
 */
public class PayFastAdapter implements ProcessadorPagamento {

    private final PayFastService payFastService;

    public PayFastAdapter(PayFastService payFastService) {
        this.payFastService = Objects.requireNonNull(payFastService, "O servico PayFast e obrigatorio.");
    }

    @Override
    public void processarPagamento(double valor, String numeroCartao) {
        if (!Double.isFinite(valor) || valor <= 0) {
            throw new IllegalArgumentException("O valor do pagamento deve ser positivo e finito.");
        }
        if (numeroCartao == null || numeroCartao.trim().isEmpty()) {
            throw new IllegalArgumentException("O numero do cartao e obrigatorio.");
        }

        // valueOf evita os artefatos de precisao de new BigDecimal(double).
        BigDecimal quantia = BigDecimal.valueOf(valor);
        payFastService.efetuarCobranca(quantia, numeroCartao, "BRL");
    }
}
