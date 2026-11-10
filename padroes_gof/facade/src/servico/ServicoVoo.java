package servico;

import java.math.BigDecimal;
import modelo.DadosCliente;
import modelo.DadosViagem;

/** Simula a busca e a reserva de passagens, com disponibilidade e preco fixos. */
public class ServicoVoo {

    public BigDecimal reservarPassagens(DadosCliente cliente, DadosViagem viagem) {
        System.out.println("Voo: buscando assentos de " + viagem.getOrigem()
                + " para " + viagem.getDestino() + ".");
        System.out.println("Voo: passagens de ida (" + viagem.getDataIda() + ") e volta ("
                + viagem.getDataVolta() + ") reservadas para " + cliente.getNome() + ".");
        return new BigDecimal("1200.00");
    }
}
