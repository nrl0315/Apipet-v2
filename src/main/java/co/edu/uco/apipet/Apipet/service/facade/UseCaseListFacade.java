package co.edu.uco.apipet.Apipet.service.facade;

import java.util.List;
import java.util.Optional;

public interface UseCaseListFacade <T>{
    List<T> execute (Optional<T> dto);
}
