package colecciones;

import java.util.Set;//papa
import java.util.HashSet;//hijo


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
		}
		
	
	}

}

/*
Colecciones

- Arrays

Un array es una estructura de datos linea que contiene elementos del mismo tipo. La longitud de un array se establece al momento de crearlo y no puede cambiar. No cuenta con metodos adicionales para agregar o eliminar elementos. Los elementos estan almacenados de forma contigua en memoria, y se puede acceder a ellos a traves de un indice. Sus principales caracteristicas son:

    1. Tamanio fijo.
    2. Acceso rapido.
    3. Coste elevado para insertar o eliminar elementos. 

*/