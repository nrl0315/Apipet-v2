package co.edu.uco.apipet.Apipet.service;

import co.edu.uco.apipet.Apipet.dto.TipoCuidadoDTO;
import co.edu.uco.apipet.Apipet.entity.TipoCuidadoEntity;
import co.edu.uco.apipet.Apipet.repository.TipoCuidadoRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TipoCuidadoServiceImpl implements TipoCuidadoService{

    private TipoCuidadoRepository repository;

    public TipoCuidadoServiceImpl(TipoCuidadoRepository repository){
        this.repository = repository;
    }

    @Override
    public TipoCuidadoDTO saveTipoCuidado(TipoCuidadoDTO tipoCuidadoDTO) {
        TipoCuidadoEntity tipoCuidadoEntity = new TipoCuidadoEntity();
        BeanUtils.copyProperties(tipoCuidadoDTO,tipoCuidadoEntity);
        repository.save(tipoCuidadoEntity);
        return tipoCuidadoDTO;
    }

    @Override
    public List<TipoCuidadoDTO> getAllTipoCuidado() {
        List<TipoCuidadoEntity> tipoCuidadoEntities = repository.findAll();
        List<TipoCuidadoDTO> tipoCuidadoDTOS = tipoCuidadoEntities.stream().map(tipoCuidadoEntity -> new TipoCuidadoDTO(tipoCuidadoEntity.getCodigo(),tipoCuidadoEntity.getNombreTipoCuidado(),tipoCuidadoEntity.getDescripcion())).collect(Collectors.toList());
        return tipoCuidadoDTOS;
    }

    @Override
    public TipoCuidadoDTO getTipoCuidadoById(Long codigo) {
        TipoCuidadoEntity tipoCuidadoEntity = repository.findById(codigo).get();
        TipoCuidadoDTO tipoCuidadoDTO = new TipoCuidadoDTO();
        BeanUtils.copyProperties(tipoCuidadoEntity,tipoCuidadoDTO);
        return tipoCuidadoDTO;
    }

    @Override
    public boolean deleteTipoCuidado(Long codigo) {
        TipoCuidadoEntity tipoCuidadoEntity = repository.findById(codigo).get();
        repository.delete(tipoCuidadoEntity);
        return true;
    }

    @Override
    public TipoCuidadoDTO updateTipoCuidado(Long codigo, TipoCuidadoDTO tipoCuidadoDTO) {
        TipoCuidadoEntity tipoCuidadoEntity = repository.findById(codigo).get();
        tipoCuidadoEntity.setNombreTipoCuidado(tipoCuidadoDTO.getNombreTipoCuidado());
        tipoCuidadoEntity.setDescripcion(tipoCuidadoDTO.getDescripcion());
        repository.save(tipoCuidadoEntity);
        return tipoCuidadoDTO;
    }
}
