package abstraccion;

public class Motocicleta extends Vehiculo{
	
	//Las anotaciones @ son "indicacines" que le damos a JAva

	@Override
	public void acelerar() {
		System.out.println("La motocicleta esta acelerando....");
		
	}
	
	//La subclase es quien decide cuando y como se sobreescribe el método abstracto. Es decir, la subclase implementa el método.

	@Override
	public void frenar() {
		System.out.println("La motocicleta esta frenando....");
		
	}

}
