package es.fplumara.dam1.lumarasports.service;

import es.fplumara.dam1.lumarasports.model.Torneo;
import es.fplumara.dam1.lumarasports.model.TorneoConEquipo;

import java.util.List;

public interface TorneoService {

    List<TorneoConEquipo> obtenerTorneosConEquipoCampeon();

    Torneo buscarPorId(Long id);

    void guardar(Torneo torneo);

    void actualizar(Torneo torneo);

    void borrar(Long id);
}
