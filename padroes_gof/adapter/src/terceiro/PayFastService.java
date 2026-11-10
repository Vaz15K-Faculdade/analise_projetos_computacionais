package terceiro;

import java.math.BigDecimal;

/**
 * Adaptee (Adaptado). Simulacao local da biblioteca externa PayFastSDK.jar,
 * que nao foi fornecida com o exercicio. Nao realiza cobrancas reais.
 * A assinatura representa a API de terceiros e nao depende do contrato da loja.
 */
public class PayFastService {

    public void efetuarCobranca(BigDecimal quantia, String cartaoCredito, String moeda) {
        String finalCartao = cartaoCredito.substring(Math.max(0, cartaoCredito.length() - 4));
        System.out.println("PayFast (simulacao): cobranca de " + moeda + " "
                + quantia.toPlainString() + " no cartao terminado em " + finalCartao);
    }
}
