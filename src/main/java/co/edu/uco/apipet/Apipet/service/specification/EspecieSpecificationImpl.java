package co.edu.uco.apipet.Apipet.service.specification;

import co.edu.uco.apipet.Apipet.repository.EspecieRepository;
import co.edu.uco.apipet.Apipet.service.EspecieService;
import org.springframework.beans.factory.annotation.Autowired;

public class EspecieSpecificationImpl implements EspecieSpecification{

    @Autowired
    EspecieRepository repository;

    @Override
    public void isSatisfied(EspecieService data) {

    }
}
