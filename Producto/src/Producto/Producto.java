package Producto;

public class Producto {
	public String nombre;
	public Double precio;

	public Producto(String nombre, Double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}

	public void imprimirInfo() {
		System.out.printf("El nombre del producto: %s %nEl precio es: %.2f\n", this.nombre, this.precio);
	}

	public void imprimirInfo(String nombre) {
		System.out.printf("El nombre del producto: %s %nEl precio es: %.2f\n", this.nombre, this.precio);
	}
	public void imprimirInfo(Integer dos) {
		System.out.printf("El nombre del producto: %s %nEl precio es: %.2f\n",this.nombre, this.precio);
}

	public void aplicarDto(Integer descuento) {
		Double descuento2 = precio * ((double) descuento / 100);
		System.out.printf("El descuento es de: %d%% \nEl precio del producto con descuento es de: %.2f", descuento,
				(precio - descuento2));
	}

}
	


