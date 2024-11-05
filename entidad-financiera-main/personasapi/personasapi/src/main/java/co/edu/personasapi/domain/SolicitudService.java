package co.edu.personasapi.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SolicitudService {

    @Autowired
    private SolicitudRepository solicitudRepository;

    // Traer todas las solicitudes
    public List<Solicitud> findAll() {
        return solicitudRepository.findAll();
    }

    // Traer una solicitud por ID
    public Optional<Solicitud> findById(int id) {
        return Optional.ofNullable(solicitudRepository.findById(id));
    }

    // Guardar o actualizar una solicitud
    public Solicitud save(Solicitud solicitud) {
        return solicitudRepository.save(solicitud);
    }

    // Eliminar una solicitud
    public void deleteById(int id) {
        solicitudRepository.deleteById(id);
    }
}
