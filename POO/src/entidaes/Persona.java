/* Notas para trabajar con POO en JAVA
 * Establecemos los pasos para trabajar co nuestras clases en el siguiente orden:
 * -Primero nuestras propiedades o atributos usando variables con JAVA
 * -Definifmos un constructor con parámetros (este constructor se define en la clase).
 * Tambien tenemos un constructor llamado "constructor con defecto", que se definen en la instancia 
 * de clase. El inconveniente que tenemos es que solo podemos usar uno de los dos.
 * 
 * -Por último, definimos los métodos que nuestro objeto va a utilizar. Aquí utilizamos la teoría 
 * de funciones (funciones vacias, funciones que retornan un tipo de valor).
 *  
 * Notas adicionales
 * 
 * Sobrecarga de métodos
 * 
 * La finalidad de la sobrecarga de métodos es utlizar el mismo nombre del método (Persona)
 * e ir variando sus parámetros. Con esto evitamos usar "Persona1", "Persona2", etc.
 * Para utilizar el mismo método en diferentes situaciones.
 * 
 * Hay que recordar que los datos generalmente vienen de un front (formularios). La sobrecarga 
 * nos ayuda a comprender distintas situaciones donde tal vez uno de los campos solicitados en el
 *  formulario no sea requerido u obligatorio de llenar. Utilizando la sobrecarga, evitamos que el
 *   dato se asigne incorrectamente (es decir, que quede como indefinido), ya que esto podría 
 *   acarrear errores en la ejecución de nuestro código. De preferenia es mejor que el dato 
 *   quede como nulo.
  */



package entidaes;

public class Persona {

	// 1. Propiedades o atributos
	public String nombre;
	public int edad;
	public String correo;
	public String telefono;

	// 2. Constructor
	public Persona(String nombre, int edad, String correo, String telefono) {
		this.nombre = nombre;
		this.edad = edad;
		this.correo = correo;
		this.telefono = telefono;

	}// Cierre de constructor

	// Sobrecarga de método overloading
	public Persona(String nombre, int edad, String correo) {
		this.nombre = nombre;
		this.edad = edad;
		this.correo = correo;
	}
		
		//Sobrecarga de método overloading
	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;

	}// Cierre de constructor
/*
	public Persona(String string, String string2, int i, float f, float g, String string3) {
			// TODO Auto-generated constructor stub
		}
*/
	// 3. Métodos
	public void mostrarInformacion() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Edad: " + edad);
		System.out.println("Correo: " + correo);
		System.out.println("Telefóno: " + telefono);
	}// Cierre mostrar información

	
	
	
	
	// Método main una función ejecutora

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Instancia de un objeto persona
		Persona Felipe = new Persona("Felipe", 31, "felipe.maqueda@idr.edu.mx", "5512345678");

		// Clase, nombre variable, palabra reservada instancia, nombre metodo
		// constructor, parametros del constructor
		Felipe.mostrarInformacion();

		Persona Anyi = new Persona("Anyi", 29, "carbono12.011@gmail.com", "3320474072");
		Anyi.mostrarInformacion();

		//Si no respetamos el orden de los parámetros ( el orden en el tipo de dato),
		//tendremos problemas para instanciar a nuestro objeto
		//Si no respetamos numero de parámetros, orden de los datos o tipo de datos, tendremos 
		//errores para instanciar nuestros objetos
		Persona Selena = new Persona("Selena", 28, "moxita@gmail.com", "3323476318");
		Selena.mostrarInformacion();

		Persona Carlos = new Persona("Carlos", 45, "señor@gmail.com", "3327874010");
		Carlos.mostrarInformacion();

		Persona Fer = new Persona("Fernanda", 29, "fer@gmail.com", "3327584010");
		Fer.mostrarInformacion();
		
		Persona Sara = new Persona("Sara", 29, "3327584010");
		Sara.mostrarInformacion();
		/*
		 * Podemos definir primero nuestros objetos, y después crear neustros constructores, eso lo
		 * hace Eclipse, arriba está el constructor comentado también
		Persona Jesus = new Persona ("Jesus", "Maqueda", 31,  1.80f, 150.67f, "felipe@gmail.com")
*/
	}// Cierre del main

}// Cierre de clase persona
