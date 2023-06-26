package Animal;

public class testAnimal {
	
	public static void main(String [] args) {
	
	
	/* Creamos un animal, en este momento usamos el método que imprime "Hacer sonido",
	 * y cuando definimos que este animal es un gato, se sobreescribe el metodo
	 * y se cambia por miau miau*/
	
	Animal Gardfield = new Gato();//Miau miau
	Gardfield.hacerSonido();
		
	Animal Godzilla = new Animal();
	
	Godzilla.hacerSonido();
	}

}
