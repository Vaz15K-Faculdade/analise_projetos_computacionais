package servico;

import java.math.BigDecimal;
import modelo.DadosCliente;
import modelo.DadosViagem;

/** Simula a confirmacao por e-mail, exibindo a mensagem no console. */
public class ServicoNotificacao {

    public void enviarConfirmacao(DadosCliente cliente, DadosViagem viagem, BigDecimal valorTotal) {
        System.out.println("Notificacao: confirmacao simulada para " + cliente.getEmail()
                + ". Pacote para " + viagem.getDestino() + ", total BRL "
                + valorTotal.toPlainString() + ".");
    }
}
