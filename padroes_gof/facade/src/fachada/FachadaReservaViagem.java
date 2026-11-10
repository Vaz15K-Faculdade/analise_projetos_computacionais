package fachada;

import java.math.BigDecimal;
import java.util.Objects;
import modelo.DadosCliente;
import modelo.DadosViagem;
import servico.ServicoAluguelCarro;
import servico.ServicoHotel;
import servico.ServicoNotificacao;
import servico.ServicoPagamento;
import servico.ServicoVoo;

/**
 * Facade (Fachada): oferece uma unica operacao para reservar o pacote completo.
 * A fachada nao impede o acesso direto aos subsistemas: eles continuam publicos
 * e podem ser utilizados separadamente quando uma personalizacao for necessaria.
 */
public class FachadaReservaViagem {

    private final ServicoVoo servicoVoo = new ServicoVoo();
    private final ServicoHotel servicoHotel = new ServicoHotel();
    private final ServicoAluguelCarro servicoCarro = new ServicoAluguelCarro();
    private final ServicoPagamento servicoPagamento = new ServicoPagamento();
    private final ServicoNotificacao servicoNotificacao = new ServicoNotificacao();

    public BigDecimal reservarPacoteCompleto(DadosCliente cliente, DadosViagem viagem) {
        Objects.requireNonNull(cliente, "O cliente e obrigatorio.");
        Objects.requireNonNull(viagem, "Os dados da viagem sao obrigatorios.");

        BigDecimal valorVoo = servicoVoo.reservarPassagens(cliente, viagem);
        BigDecimal valorHotel = servicoHotel.reservarQuarto(cliente, viagem);
        BigDecimal valorCarro = servicoCarro.reservarVeiculo(cliente, viagem);
        BigDecimal valorTotal = valorVoo.add(valorHotel).add(valorCarro);

        servicoPagamento.processarPagamento(cliente, valorTotal);
        servicoNotificacao.enviarConfirmacao(cliente, viagem, valorTotal);
        return valorTotal;
    }
}
