package colecciones;

public class Cliente {
	//1. Atributos
	public String nombre;
	private String cuentaBancaria;
	private float saldo;
	private String nip;
	
	
	//2. Constructor
	
	public Cliente(String nombre, String cuentaBancaria, float saldo, String nip) {
		this.nombre = nombre;
		this.cuentaBancaria = cuentaBancaria;
		this.setSaldo(saldo);
		this.nip = nip;
	}
	
	//3. Métodos
	
	public void mostrarInfoCliente() {
		System.out.println("El nombre es: " + nombre);
		System.out.println("La cuenta bancaria es: " + cuentaBancaria);
		System.out.println("El sando es: " + getSaldo());
		System.out.println("El nip es: " + nip);
	}//Mostrar info cliente
	
	
	//Getter y setters
	public float getSaldo() {
		return saldo;
	}//Getter

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}//Setter

	public String getCuentaBancaria() {
		return cuentaBancaria;
	}

	public void setCuentaBancaria(String cuentaBancaria) {
		this.cuentaBancaria = cuentaBancaria;
	}
	
	
	/*Encapsulamiento (1 de los 4 pilares de la POO)
	 * Tiene que ver con la forma en como ocultamos algunos detalles de nuestra clase (atributos y métodos).
	 * La gran ventaja de hacer esto es que podemos protejer los datos y el comportamiento de una clase. Cuando utilizamos
	 * los modificadores de acceso podemos controlar la forma en como se accede a los datos y como interactuamos con ellos.
	 * 
	 * Modificadores de acceso
	 * 
	 * -public
	 * -private
	 * -proegido
	 * -default (sin modificador de acceso)
	 * 
	 * Con esto buscanos evitar:
	 * 
	 * -reasignació de valores
	 * 
	 * float cuenta = 157,478.75f;
	 * cuenta = 0.00f;
	 * 
	 * Cuando declaramos los atributos como privados se impide el acceso a esta información (No podremos imprimirla en consola
	 * ni mucho menos modificarla).
	 * 
	 * Jesus. nombre = Si puedo acceder a ellos porque la información está publica
	 * Jesus.saldo = No se muestra porque la información está privada
	 * 
	 * Para solvertar esto, usamos los getters y setters. El gerrer nos permite acceder al dato por medio de un método público 
	 * llamdao get, y tambien podemos modificar la información por medio del set (método público).
	 * 
	 * Jesus.getCuentaBancaria = Si puedo acceder a la información
	 *  Jesus.setCuentaBancaria = Si puedo modificar a la información
	 *  
	 *  Ventajas del encapsulamiento
	 *  
	 *  -Protección de datos: Cuando dejamos los datos en privado, se evita que se sobreescriban, que se accedan 
	 *  directamente a ellos y se modifiquen de manera incontrolada.
	 *  
	 *  -Control de acceso: Podemos usar validaciones o valores booleanos para tener acceso o no la la información (que un
	 *  un administrador pueda usar un setter para modificar algún dato en específico).
	 *  
	 *  -Flexibilidad y mantenimiento: podemos cambiar la implementacipon interna de nuestras clases (modificar el acceso, etc),
	 *  sin modificar el códgo externo que la utiliza (herencia, etc).
	 *  
	 *  -Abstracción: El encapusulamiento nos permite ocultar los detalles internos de una clase, y nos proporciona un enfoque 
	 *   "mas limpio" sobre lo que hace una clase, mas no como lo hace. 
	 * 
	 * 
	 * */

}
