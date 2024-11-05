
package co.edu.personasapi.domain;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tipo_perosonas")

public class TipoPersona {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_tp;
    @Column
    private String nombre_tp;

    // seters y geters
    public int getId_tp() {
        return id_tp;
    }

    public void setId_tp(int id_tp) {
        this.id_tp = id_tp;
    }

    public String getNombre_tp() {
        return nombre_tp;
    }

    public void setNombre_tp(String nombre_tp) {
        this.nombre_tp = nombre_tp;
    }

    // vacio

    public TipoPersona() {
    }
}


