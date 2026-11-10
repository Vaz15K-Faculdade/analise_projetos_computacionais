package servico;

import java.math.BigDecimal;
import modelo.DadosCliente;
import modelo.DadosViagem;

/** Simula um hotel com quartos disponiveis e diaria de R$ 250,00. */
public class ServicoHotel {

    public BigDecimal reservarQuarto(DadosCliente cliente, DadosViagem viagem) {
        System.out.println("Hotel: verificando disponibilidade em " + viagem.getDestino() + ".");
        System.out.println("Hotel: quarto reservado para " + cliente.getNome()
                + " por " + viagem.getQuantidadeDiarias() + " diarias.");
        return new BigDecimal("250.00").multiply(BigDecimal.valueOf(viagem.getQuantidadeDiarias()));
    }
}
