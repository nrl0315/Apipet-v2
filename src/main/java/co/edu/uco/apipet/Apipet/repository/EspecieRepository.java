package co.edu.uco.apipet.Apipet.repository;

import co.edu.uco.apipet.Apipet.entity.EspecieEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface EspecieRepository extends JpaRepository<EspecieEntity, Long> {
}
