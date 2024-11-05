package co.edu.personasapi.domain;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.Repository;

import java.util.List;

public interface SolicitudRepository extends JpaRepository<Solicitud , Integer> {
    List<Solicitud> findAll();

    Solicitud findById(int id);

    Solicitud save(Solicitud u);

    void delete(Solicitud u);

}
