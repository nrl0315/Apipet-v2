package co.edu.uco.apipet.Apipet.dto;

import java.util.UUID;

public class EspecieDTO {
    private Long codigo;
    private String nombreEspecie;
    private String descripcion;

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNombreEspecie() {
        return nombreEspecie;
    }

    public void setNombreEspecie(String nombreEspecie) {
        this.nombreEspecie = nombreEspecie;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public EspecieDTO(final Long codigo, final String nombreEspecie, final String descripcion){
        this.codigo = codigo;
        this.nombreEspecie = nombreEspecie;
        this.descripcion = descripcion;
    }

    public EspecieDTO(){
    }
}
