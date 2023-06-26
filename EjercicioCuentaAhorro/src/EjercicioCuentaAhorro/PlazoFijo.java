package EjercicioCuentaAhorro;

public class PlazoFijo extends Cuenta {
	
	//1. Atributos
	public int plazo;
	public double interes;
	
	//2. Método constructor
	public PlazoFijo(String titular, float cantidad, int plazo, double interes) {
		super(titular, cantidad);
		this.plazo = plazo;
		this.interes = interes;
			}
	//Método obtener importe interes
	public double obtenerImporteInteres() {
		return cantidad*(interes/100);
	}
	
	//Metodo para mostrarInformación
	public void mostrarInformacionPlazoFijo() {
		System.out.println("Información de la cuenta Plazo Fijo");
		imprimirDatosCuenta(); //Método imprimir datos de la clase cuenta
		System.out.println("Plazo: " + plazo);
		System.out.println("Interes: " + interes);
		System.out.println("Total de Interes: " + obtenerImporteInteres());
	}

}
