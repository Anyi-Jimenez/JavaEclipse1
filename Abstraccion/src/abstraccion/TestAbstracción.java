package abstraccion;

public class TestAbstracción {

	public static void main(String[] args) {
		
		
		//Instancia de la clase automovil
		Automovil myTroquita = new Automovil();
		
		//Instancia de la clase motocicleta
		Motocicleta ninja = new Motocicleta();
		
		//Llamamos a los métodos de cada intancia
		myTroquita.acelerar();
		ninja.acelerar();
		
		myTroquita.frenar();
		ninja.frenar();
		
		//La única clase abstracta es el vehículo, el automovil y motocicleta son clases concretas.e
		


	}

}
