package aplicacao;

import fachada.FachadaReservaViagem;
import java.time.LocalDate;
import modelo.DadosCliente;
import modelo.DadosViagem;

public class Principal {

    public static void main(String[] args) {
        DadosCliente cliente = new DadosCliente("Maria Silva", "maria@example.com");
        DadosViagem viagem = new DadosViagem("Cuiaba", "Recife",
                LocalDate.of(2027, 1, 10), LocalDate.of(2027, 1, 15));

        FachadaReservaViagem fachada = new FachadaReservaViagem();
        // O cliente conclui a reserva com uma unica chamada, sem conhecer os servicos.
        fachada.reservarPacoteCompleto(cliente, viagem);
    }
}
