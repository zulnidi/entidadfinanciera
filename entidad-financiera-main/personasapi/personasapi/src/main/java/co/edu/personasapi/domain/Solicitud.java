package co.edu.personasapi.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "Solicitud")
public class Solicitud {


    // atributos
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String descripcion;

    @Column
    private String estado;

    // getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    // vacio

    public Solicitud() {
    }
}
