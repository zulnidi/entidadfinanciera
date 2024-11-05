package co.edu.personasapi.domain;
import java.util.List;

public interface ProductoService {
	
	
	Producto listarId(int id);
	Producto add(Producto p);
	Producto edit(Producto p);
	Producto delete(int id);

	List<Producto> Listar();

	
}
