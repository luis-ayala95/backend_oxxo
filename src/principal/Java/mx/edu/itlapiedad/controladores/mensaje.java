package mx.edu.itlapiedad.controladores;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import mx.edu.itlapiedad.dao.ProductoDAO;


@RestController
@RequestMapping("/devops")
public class mensaje {
	
@Autowired
ProductoDAO repositorio;

	@GetMapping("/Hola")
	public String mostrtarHola(@RequestParam String nombre) {
	return "hola clase de devops"+nombre;	
	}
	
	
	
}
