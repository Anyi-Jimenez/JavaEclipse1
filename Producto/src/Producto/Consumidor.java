package Producto;

public class Consumidor extends Producto {

	public Consumidor(String nombre, Double precio) {
		super(nombre, precio);
	}

	public static void main(String[] args) {
		Producto producto = new Producto("Cojín", 500.0d);
		
		producto.imprimirInfo();
		producto.aplicarDto(5);

	}

}


