package servico;

import java.math.BigDecimal;
import modelo.DadosCliente;
import modelo.DadosViagem;

/** Simula uma locadora com veiculos disponiveis e diaria de R$ 150,00. */
public class ServicoAluguelCarro {

    public BigDecimal reservarVeiculo(DadosCliente cliente, DadosViagem viagem) {
        System.out.println("Carro: veiculo reservado em " + viagem.getDestino()
                + " para " + cliente.getNome() + " por " + viagem.getQuantidadeDiarias() + " diarias.");
        return new BigDecimal("150.00").multiply(BigDecimal.valueOf(viagem.getQuantidadeDiarias()));
    }
}
