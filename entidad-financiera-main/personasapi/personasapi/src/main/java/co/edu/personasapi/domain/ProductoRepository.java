package co.edu.personasapi.domain;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

public interface ProductoRepository extends JpaRepository<Producto, Integer> {
	
	List<Producto> findAll();
	
	Producto findById(int id);
	Producto save(Producto p);
	void delete(Producto p); 
	
}
