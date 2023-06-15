package co.edu.uco.apipet.Apipet.service;

import co.edu.uco.apipet.Apipet.dto.TipoCuidadoDTO;
import co.edu.uco.apipet.Apipet.entity.TipoCuidadoEntity;
import co.edu.uco.apipet.Apipet.repository.TipoCuidadoRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

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
}
