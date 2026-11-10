package aplicacao;

import pagamento.PayFastAdapter;
import pagamento.ProcessadorPagamento;
import terceiro.PayFastService;

public class Principal {

    public static void main(String[] args) {
        ProcessadorPagamento processador = new PayFastAdapter(new PayFastService());
        finalizarCompra(processador, 149.90, "4111111111111111");
        finalizarCompra(processador, 0.10, "5555555555554444");
    }

    // O codigo cliente depende apenas da interface que o e-commerce ja conhece.
    private static void finalizarCompra(ProcessadorPagamento processador, double valor, String cartao) {
        System.out.println("Solicitando pagamento pela interface ProcessadorPagamento...");
        processador.processarPagamento(valor, cartao);
    }
}
