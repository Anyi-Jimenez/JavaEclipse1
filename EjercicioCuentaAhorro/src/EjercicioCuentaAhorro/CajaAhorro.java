package EjercicioCuentaAhorro;

public class CajaAhorro extends Cuenta {
	
	//2. Métodos (heredar datos)
	
	public CajaAhorro(String titular, float cantidad) {
		super(titular, cantidad);
	
		
	}//CajaAhorro
	
	public void imprimirDatosCajaAhorro() {
		System.out.println("Titular " + titular);
		System.out.println("cantidad " + cantidad);
	}//Imprimir datos

	@Override
	public String toString() {
		return "CajaAhorro [titular=" + titular + ", cantidad=" + cantidad + "]";
	}
	
	//toString

}//CajaAhorro
