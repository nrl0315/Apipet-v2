package co.edu.uco.apipet.Apipet.dto;

public class TipoCuidadoDTO {

    private Long codigo;
    private String nombreTipoCuidado;
    private String descripcion;

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNombreTipoCuidado() {
        return nombreTipoCuidado;
    }

    public void setNombreTipoCuidado(String nombreTipoCuidado) {
        this.nombreTipoCuidado = nombreTipoCuidado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public TipoCuidadoDTO(final Long codigo, final String nombreTipoCuidado, final String descripcion){
        this.codigo = codigo;
        this.nombreTipoCuidado = nombreTipoCuidado;

    }

    public TipoCuidadoDTO(){

    }
}
