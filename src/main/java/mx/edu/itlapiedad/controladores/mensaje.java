package mx.edu.itlapiedad.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import mx.edu.itlapiedad.dao.ProductoDAO;
import mx.edu.itlapiedad.models.Producto;

@RestController
@RequestMapping("/devops")
public class mensaje {
	
@Autowired
ProductoDAO repositorio;
	@GetMapping("/Hola")
	public String mostrtarHola(@RequestParam String nombre) {
	return "hola"+nombre;	
	}
	@GetMapping("consultaProduc")
	public List<Producto>consultarProductos(){
		return repositorio.consultar();
	}
	@PostMapping("/insertar")
	public void insertarProducto(@RequestBody Producto pro) {
		repositorio.insertarProducto(pro);
	}
}
