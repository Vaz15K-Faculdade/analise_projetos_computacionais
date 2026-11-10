package modelo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

public class DadosViagem {

    private final String origem;
    private final String destino;
    private final LocalDate dataIda;
    private final LocalDate dataVolta;

    public DadosViagem(String origem, String destino, LocalDate dataIda, LocalDate dataVolta) {
        if (origem == null || origem.trim().isEmpty() || destino == null || destino.trim().isEmpty()) {
            throw new IllegalArgumentException("A origem e o destino sao obrigatorios.");
        }
        Objects.requireNonNull(dataIda, "A data de ida e obrigatoria.");
        Objects.requireNonNull(dataVolta, "A data de volta e obrigatoria.");
        if (!dataVolta.isAfter(dataIda)) {
            throw new IllegalArgumentException("A volta deve ocorrer depois da ida.");
        }
        this.origem = origem;
        this.destino = destino;
        this.dataIda = dataIda;
        this.dataVolta = dataVolta;
    }

    public String getOrigem() {
        return origem;
    }

    public String getDestino() {
        return destino;
    }

    public LocalDate getDataIda() {
        return dataIda;
    }

    public LocalDate getDataVolta() {
        return dataVolta;
    }

    public long getQuantidadeDiarias() {
        return ChronoUnit.DAYS.between(dataIda, dataVolta);
    }
}
