package co.edu.uco.apipet.Apipet.service.specification;

public interface Specification <T>{
    void isSatisfied(T data);
}
