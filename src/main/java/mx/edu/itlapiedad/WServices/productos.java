package mx.edu.itlapiedad.WServices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.edu.itlapiedad.dao.ProductoDAO;
import mx.edu.itlapiedad.models.Producto;

@RestController
@RequestMapping("/devops")
public class productos {
	@Autowired
	ProductoDAO repositorio;

	@GetMapping("consultaProduc")
	public List<Producto>consultarProductos(){
		return repositorio.consultar();
	}
	@PostMapping("/insertar")
	public void insertarProducto(@RequestBody Producto pro) {
		repositorio.insertarProducto(pro);
	}
	
	@PutMapping("/producto/{id}")
	public void actualizar_producto(@RequestBody Producto pro,
			@PathVariable int id) {
		repositorio.actualizarProducto(pro,id);
	}
	@GetMapping("consultaProduc/{id}")
	public List<Producto>consultarId(@PathVariable int id){
		return repositorio.consultarI(id);
	}
}
