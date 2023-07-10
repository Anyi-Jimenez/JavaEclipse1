package com.hotelGeneration.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotelGeneration.Entity.User;
import com.hotelGeneration.Service.UserService;

/*El controller es quien lleva todo el peso referente a las solicitudes HTTP (es el meseto de nuestro restaurante). Aquí sucede la manipulación de los metodos HTTP (GET, POST, PUT, DELETE)
 * Para poder decirle a JAVA que esta clse es un controller, necesitamos uar la anotacions @RestController. ESto nos ayudará para poder manejar solicitudes HTTP, y además con esta anotación podremos manejar el fetch que tengaos en nuestri frint
 *  */
@RequestMapping(path = "/hotelGeneration/users") //Construi la ruta de nuestra API
@RestController  //Usamos esta anotación para decirle que es una API del tipo REST (que trabaja con métodos HTTP)
public class UserController {
	
	// Creo una instancia de la clase UserService para que el controlador sepa la información del servicio
	
	private final UserService userService;
	
	@Autowired
	
	//Creo un constructor para mi controller, tomará como argumento la instancia del userService
	public UserController(UserService userService) {
		
		this.userService = userService;
	}//Constructo que utiliza la instancia del service como parámetro
	
	
	/*Ya que mi controller de pende de mi Service (con la instancia de UserSEsrvice dentro de UserController), podré establecer los métodos HTTP que disparan las operaciones del CRUD (Controller - SErvice) */
	
	//Meétidis HTTP
	
	/*Metodo Get que toma la lista de usuarios creada en el userService*/
	
	@GetMapping
	
	public List <User>  getUsuarios(){
		return userService.readUsuarios();
	}
	

}
