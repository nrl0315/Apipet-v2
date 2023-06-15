package co.edu.uco.apipet.Apipet.service;

import co.edu.uco.apipet.Apipet.dto.TipoCuidadoDTO;

import java.util.List;

public interface TipoCuidadoService {

    TipoCuidadoDTO saveTipoCuidado(TipoCuidadoDTO tipoCuidadoDTO);
    List<TipoCuidadoDTO> getAllTipoCuidado();
    TipoCuidadoDTO getTipoCuidadoById(Long codigo);
    boolean deleteTipoCuidado(Long codigo);
    TipoCuidadoDTO updateTipoCuidado(Long codigo, TipoCuidadoDTO tipoCuidadoDTO);
}
