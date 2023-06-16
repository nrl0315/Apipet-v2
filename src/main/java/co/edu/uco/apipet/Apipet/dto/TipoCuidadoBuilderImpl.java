package co.edu.uco.apipet.Apipet.dto;

import co.edu.uco.apipet.Apipet.dto.TipoCuidadoBuilder;

public class TipoCuidadoBuilderImpl implements TipoCuidadoBuilder {

    private Long codigo;
    private String nombreTipoCuidado;
    private String descripcion;


    @Override
    public TipoCuidadoBuilder setCodigo(Long codigo) {
        this.codigo = codigo;
        return this;
    }

    @Override
    public TipoCuidadoBuilder setNombreTipoCuidado(String nombreTipoCuidado) {
        this.nombreTipoCuidado = nombreTipoCuidado;
        return this;
    }

    @Override
    public TipoCuidadoBuilder setDescripcion(String descripcion) {
        this.descripcion = descripcion;
        return this;
    }
}
