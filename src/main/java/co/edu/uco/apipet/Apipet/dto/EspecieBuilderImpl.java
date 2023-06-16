package co.edu.uco.apipet.Apipet.dto;

import co.edu.uco.apipet.Apipet.dto.EspecieBuilder;

public class EspecieBuilderImpl implements EspecieBuilder {

    private Long codigo;
    private String nombreEspecie;
    private String descripcion;


    @Override
    public EspecieBuilder setCodigo(Long codigo) {
        this.codigo = codigo;
        return this;
    }

    @Override
    public EspecieBuilder setNombreEspecie(String nombreEspecie) {
        this.nombreEspecie = nombreEspecie;
        return this;
    }

    @Override
    public EspecieBuilder setDescripcion(String descripcion) {
        this.descripcion = descripcion;
        return this;
    }
}
