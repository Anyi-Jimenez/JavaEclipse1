/*
 *Herencia en la POO
 *
 * Nos permite heredar atributos y métodos con la finalidad de reutilizar código y generar
 *  una relación entre clases superiores (padres) y las subclases (hijos).
 * 
 *  Clase superior =  súper clase
 *  
 *  si hay mas descendientes el atecesor queda como clase padre de los sucesores.
 *  
 *  Para heredar, usamos la palabra reservada llamada extends. Esta palabra se coloca 
 *  al aldo del nombre d emi clase (Empleado) , y despyés definimos el lugar de 
 *  donde nos vamos a traer las cosas qu quwremos jeredar (persona).++Para heredar 
 *  constructores de una fomra mu rapida, daremos clic derecho sobre
 *  nuesro editor de codigo, después buscaremos la opción source y después en la opción
 *  de Generarte constructor
 * 
 * */


package entidaes;

//Primero tengo que dar la instrucción de que quiero heredar
public class Empleado extends Persona {
//1. Atributos propiedades

	public String numEmpleado;
	public String nss;
	public String puesto;

	

	// 2. Constructores con parámetros
public Empleado(String nombre, int edad, String correo, String telefono, String numEmleado, String nss,
		String puesto) {
	super(nombre, edad, correo, telefono);//Nos indica que heredamos (esto es de la clase superior)
	this.numEmpleado = numEmpleado;
	this.nss = nss;
	this.puesto = puesto;
	
	
	//Heredar constructores sobrecargados
	
	
}
public Empleado(String nombre, int edad, String correo, String numEmpleado, String nss, String puesto) {
	super(nombre, edad, correo);
	this.numEmpleado = numEmpleado;
	this.nss = nss;
	this.puesto = puesto;
}
//3. Metodo para imprimirInformacion empleado
public void mostrarInformacion() {
    System.out.println("Nombre: " + nombre);
    System.out.println("Edad: " + edad);
    System.out.println("Correo: " + correo);
    System.out.println("Telefono: " + telefono);
    System.out.println("Numero Empleado: " + numEmpleado);
    System.out.println("Numero Seguro Social: " + nss);
    System.out.println("Puesto: " + puesto);

}//Cierre mostrar información


//4. toString
//toString es un método en Java que proviene de la clase objeto (el antecesor o precursor de todos
//los objetos que existene en Java). ESte metodo ya se escribio, ya esta definido y nos permite
//mostrar la información del objeto en una cadena de texto.



@Override
public String toString() {
	return "Empleado [numEmpleado=" + numEmpleado + ", nss=" + nss + ", puesto=" + puesto + ", nombre=" + nombre
			+ ", edad=" + edad + ", correo=" + correo + ", telefono=" + telefono + "]";
}



}
