package es.fplumara.dam1.lumarasports.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

// genera getters, setters y más métodos útiles,
@Data

// genera el constructor vacío,
@AllArgsConstructor

// genera el constructor con todos los campos.
@NoArgsConstructor
public class TorneoConEquipo {
    private Long id;
    private String nombreTorneo;
    private String ciudad;
    private BigDecimal premio;
    private String nombreEquipo;
}