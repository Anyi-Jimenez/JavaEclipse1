package entidaes;

public class Test {

	public static void main(String[] args) {
		System.out.println("Instancia de empleado");
		Empleado EvilFelipe = new Empleado("EvilFelipe", 31, "evilFelipe@gmail.com", "5511223344", "ABC123", "90876567389", "Bell Boy" );
		
		EvilFelipe.mostrarInformacion();
		
		//Instancia de una persona
		System.out.println("instancia de persona");
		Persona Naruto = new Persona ("Naruto", 30, "naruto@gmail.com", "5533444455555");
		Naruto.mostrarInformacion();
		
		System.out.println("Impresión de objetos\n");
		System.out.println(EvilFelipe);
		
		System.out.println(Naruto.toString());
		
		/*Leer la documentación de JAVA, se puede abrir en la web pasando el cursor por
		 * encima de lo que tengo duda y ver la descripción, también lo puedo abrir een un a
		 *pantalla externa.
		 *La clase objeto es la principal, el método toString es heredado de la clase objeto
		
		 */
		
		//Instancia de un cliente
		System.out.println(); //espacio
		System.out.println("Instancia de un cliente");
		
		Cliente Jesus = new Cliente ("Jesus Gonzalez", "ABCD1234", 157543.00f, "1234");
		Jesus.mostrarInfoCliente();
		
		//Modificacón de un atributo
		
		Jesus.nombre = "Evil Jesus";
		Jesus.setSaldo(0.00f);
		
		Jesus.setCuentaBancaria("XYZ098");
		
		//Acceder a información privada
		//System.out.println(Jesus.saldo);
		
		//Acceder a información privada con ayuda del getter
		System.out.println(Jesus.getCuentaBancaria());
		
		//Impresión del objeto ya modificado
		System.out.println(); //Espacio
		Jesus.mostrarInfoCliente();
	
	}

}
