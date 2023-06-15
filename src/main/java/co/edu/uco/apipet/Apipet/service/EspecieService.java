package co.edu.uco.apipet.Apipet.service;

import co.edu.uco.apipet.Apipet.dto.EspecieDTO;

import java.util.List;
import java.util.UUID;

public interface EspecieService {

    EspecieDTO saveEspecie(EspecieDTO especieDTO);
    List<EspecieDTO> getAllEspecies();
    EspecieDTO getEspecieById(Long codigo);
    boolean deleteEspecie(Long codigo);
    EspecieDTO updateEspecie(Long codigo, EspecieDTO especieDTO);
}
