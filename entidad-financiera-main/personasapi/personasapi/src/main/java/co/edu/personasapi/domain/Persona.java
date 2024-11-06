
package co.edu.personasapi.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "persona")
public class Persona {
	 @Id
	 @Column
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private int id_p;

	 // atributos
	 @Column
	 private String nombre_p;
	
	 @Column
	 private String apellido_p;
	 @Column
	 private int id_tp_p;
	// get y set
	 public int getId() {
	 return id_p;
	 }
	 public void setId(int id) {
	 this.id_p = id;
	 }
	 public String getNombres() {
	 return nombre_p;
	 }
	 public void setNombres(String nombres) {
	 this.nombre_p = nombres;
	 }
	 public String getApellidos() {
	 return apellido_p;
	 }
	 public void setApellidos(String apellidos) {
	 this.apellido_p = apellidos;
	 }
	 public int getId_tp() {
	 return id_tp_p;
	 }
	 public void setId_tp(int id_tp) {
	 this.id_tp_p = id_tp;
	 }
} // Buen trabajo
// Good job


