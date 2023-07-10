package com.hotelGeneration.Service;
import java.util.List;
import java.util.ArrayList;
import org.springframework.stereotype.Service;
import com.hotelGeneration.Entity.User;

/*Recuerda que la capa de servicios, se encarga de definir a logica de negocio del lado de Java (aquí es donde vamos a definir los metodos enfocados a las operaciones del CRUD que serpan "disparados" pos los metodos HTTP que se encontrarán en el controller*/

//Anotaciones son instrucciones que le damos a JAVA para que sepra hacer algo(@test, @override)



@Service  //Usamos la anotación @Service para decirle a Java que esta clase es un servicio
public class UserService {
	
	
	//Emular una pequeña base de datos usando un ArrayList (lista de usuarios)
	public List<User> listaDeUsuarios = new ArrayList<User>();
	
	//Creo un método llamado UserService que me permita agregar información a i lista
	public UserService() {
	//Instancia de las personas
	listaDeUsuarios.add(new User ("Felipe", "Maqueda", "felipe@gmail.com", "5512345678"));
	listaDeUsuarios.add(new User ("Mariana", "Valladolid", "mariana@gmail.com", "3312345678"));
	listaDeUsuarios.add(new User ("Naruto", "Uzumaki", "naruto@gmail.com", "5525345678"));
	}

	//Métodos CRUD para poder iterar sobre esos usuarios
	
	//Método para traer a todos los usuarios
	public List<User> readUsuarios(){
		return listaDeUsuarios;
	}
	
}
