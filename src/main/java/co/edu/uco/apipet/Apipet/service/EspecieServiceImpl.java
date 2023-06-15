package co.edu.uco.apipet.Apipet.service;

import co.edu.uco.apipet.Apipet.dto.EspecieDTO;
import co.edu.uco.apipet.Apipet.entity.EspecieEntity;
import co.edu.uco.apipet.Apipet.repository.EspecieRepository;
import com.fasterxml.jackson.databind.util.BeanUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class EspecieServiceImpl implements EspecieService{

    private EspecieRepository repository;
    public EspecieServiceImpl(EspecieRepository repository){
        this.repository = repository;
    }

    @Override
    public EspecieDTO saveEspecie(EspecieDTO especieDTO) {
        EspecieEntity especieEntity = new EspecieEntity();
        BeanUtils.copyProperties(especieDTO,especieEntity);
        repository.save(especieEntity);
        return especieDTO;
    }

    @Override
    public List<EspecieDTO> getAllEspecies() {
        List<EspecieEntity> especieEntities = repository.findAll();
        List<EspecieDTO> especieDTOS = especieEntities.stream().map(especieEntity -> new EspecieDTO(especieEntity.getCodigo(),especieEntity.getNombreEspecie(),especieEntity.getDescripcion())).collect(Collectors.toList());
        return especieDTOS;
    }

    @Override
    public EspecieDTO getEspecieById(Long codigo) {
        EspecieEntity especieEntity = repository.findById(codigo).get();
        EspecieDTO especieDTO = new EspecieDTO();
        BeanUtils.copyProperties(especieEntity,especieDTO);
        return especieDTO;
    }

    @Override
    public boolean deleteEspecie(Long codigo) {
        EspecieEntity especieEntity = repository.findById(codigo).get();
        repository.delete(especieEntity);
        return true;
    }

    @Override
    public EspecieDTO updateEspecie(Long codigo, EspecieDTO especieDTO) {
        EspecieEntity especieEntity = repository.findById(codigo).get();
        especieEntity.setNombreEspecie(especieDTO.getNombreEspecie());
        especieEntity.setDescripcion(especieDTO.getDescripcion());
        repository.save(especieEntity);
        return especieDTO;
    }
}
