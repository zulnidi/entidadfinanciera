package co.edu.personasapi.domain;

import java.util.List;

public interface SolicitudServices {

        List<Solicitud> listar();
        Solicitud findById(int id);
        Solicitud add(Solicitud u);
        Solicitud edit(Solicitud u);
        Solicitud delete(int id);
    }


