package colecciones;

import java.util.Set;//papa
import java.util.HashSet;//hijo

import java.util.ArrayList;
import java.util.List;



import java.util.Map;
import java.util.HashMap;


public class Colecciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declarando mi primer arreglo de Java []
		//Primero el tipo de dato que voy a almacenar, le pongo corchetes cuadrados, después el nombre d emi arreglo y por ultimo instacio mi arreglo
		//Los datos que voy a guardar en este arreglo van dentro de {}
		String[] listaCompras = new String[] {"leche", "pan", "frutas"};
		
		//Impresión de mi array
		System.out.println(listaCompras);
		
		//forEach para imprimir cada elemento de mi lista de compras
		
		//para nuestros datos del tipo String, que se almacenan en una variable temporal llamada ProdcutoTemporal, que se esta llenando de un arreglo llamado listaCompras, vas a imprimir ese productoTemporal
		for(String productoTemporal : listaCompras) {
			System.out.println(productoTemporal);
		}
		
		//Arreglo mi arreglo de habitaciones de un hotel
		
		String[] habitaciones = new String[10];
		
		//Asigno valores a cada índice
		habitaciones[0] = "101";
		habitaciones[1] = "102";
		habitaciones[2] = "103";
		habitaciones[3] = "104";
		habitaciones[4] = "105";
		habitaciones[5] = "106";
		habitaciones[6] = "107";
		habitaciones[8] = "109";
		habitaciones[9] = "110";
	
		/*Habitaciones[10] = "111"; Si tratamos de acceder a un elemento más allá de los elementos declarados al principio, tendremos una excepción que solo verremos cuando se ejecute el programa*/
		
		//Cuando imprimimos un elemnto que noe stá definido dentro del arreglo, veremos null. ESto para  porque para JAVA se preferible tener un elemento nulo a uno indefinido.
		
		System.out.println(habitaciones[8]);

		//En caso de querer usar un foreach para imprimir los elementos, solo se imprimiran 7 elementos. (solo itera sobre los elementos existentes).
		
		for(String habitacionTemporal : habitaciones) {
			System.out.println(habitacionTemporal);
		}//for
		
		//ArrayList para una lista de contactos
		
		//Uso la interface List que almacena Contactos (objeto), se llama listaDeContactos e instancia un arrayList para manejar los mismos tipos de datos (contacto). 
		List<Cliente> listaDeClientes = new ArrayList<>();
		
		//Primero instancio un objeto de la clase cliente (nombre, cuenta, saldo. nip)
		Cliente Felipe = new Cliente ("Felipe Maqueda", "ABC123", 156.50f, "1234");
		
		//Agrego el cliente a mi lista de clientes con el método add
		listaDeClientes.add(Felipe);
		
		//Instancio al cliente y lo agrego a la lista
		listaDeClientes.add(new Cliente("Naruto", "XXX111", 100.00f, "0000"));
		
		//Primero crear mis objetos, y luego aregarlos
		//Hacer los mismo en una sola línea
		
		//Imprimo la información de mi lista
		System.out.println(listaDeClientes);
		System.out.println();
	//
		//Sacar un elemento de la lista y asignarlo a una variable
		Cliente datoDeLaLista = listaDeClientes.get(0);
		
		//Imprimir el elemento de la lista con un dato específico
		System.out.println(datoDeLaLista);
		
		System.out.println();
		
		listaDeClientes.remove(0);
	
			System.out.println(listaDeClientes);
		
			//Conjunto para servicios de un hotel
			Set<String> roomService = new HashSet<>();
			
			//Agregamos elementos a nuestro hashset
			
			roomService.add("Chilaquiles");
			roomService.add("Agua mineral");
			roomService.add("Wi-fi");
			
			//Hotel co promoción (si pidieron agua mineral aplicamos un descuento del 50%
			
			if(roomService.contains("Agua mineral")) {
				System.out.println("Obtienes un descuento del 50%");
			}
			
			//Que pasa si imprimo mi roomService?
			
			//Borramos toda la lista de room service
			roomService.clear();
			
			System.out.println(roomService);
			
			//HashMap para mi sistema de reservas del hotel
			
			Map<String, Cliente> reservaHabitacion = new HashMap<>();
			
			reservaHabitacion.put("101", new Cliente("Jesus", "135JJJ", 1890.87f, "0011"));
			
			reservaHabitacion.put("102", new Cliente("Bugs Bunny", "BGSB12", 10890.87f, "7777"));
			
			//Impresión de una reserva
			
			Cliente reservaBugsBunny = reservaHabitacion.get("102");//Obtener un dato del hashmap (key)
			
			
			//Qué pasa si imprimo la variable reservaHabitación
	
	}//main

}

/*
Colecciones

- Arrays

Un array es una estructura de datos linea que contiene elementos del mismo tipo. La longitud de un array se establece al momento de crearlo y no puede cambiar. No cuenta con metodos adicionales para agregar o eliminar elementos. Los elementos estan almacenados de forma contigua en memoria, y se puede acceder a ellos a traves de un indice. Sus principales caracteristicas son:

    1. Tamanio fijo.
    
    2. Acceso rapido.
    3. Coste elevado para insertar o eliminar elementos. 
    
    
    -ArrayList
    
    Es una implementació de una colección llamada list (interface superior), y se utiliza mucho para almacenar elementos en una forma dinámica.
    
    Las principales características de un ArrayList son:
    
    1. Tamaño dinámico
    2. Acceso rápido
    3. Coste elevado para insertar o eliminar elementos
    
    
- set
Es una estructura de datos que almacena elementos únicos sin orden específico. Las principales características de un set son:

1. No hay elementos duplicados
2. No hay un orden específico
3. Búsqueda más rapida (key-value)

-HashMap

Es una implementación de lainterfazz Map de Java, que permite que la información se almacene en pares clave-valor. Sus principales características son:

1. Almacenamiento K y V
2. Sin orden específico
3. Busqueda rápida
4. Iteración rapida (for each)
5. No sincronizado (hilos)
 * 

 */
    
    
    
    
    
