package tests;

import EjercicioCuentaAhorro.CajaAhorro;
import EjercicioCuentaAhorro.PlazoFijo;

public class ClaseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Instacia #1 (cuentaAhorro)
		
		CajaAhorro instancia1 = new CajaAhorro("Felipe Maqueda", 1000.0f);//cuando no quiero polimorfear
		//Instancia #2 (plazoFijo)
		                                   //Titular, cantidad, plazo, interés
		PlazoFijo instancia2 = new PlazoFijo("Jesús Gonzalez", 2500.0f,12,5.0);
		
		//Mostrar información de las cuentas
		instancia1.imprimirDatosCajaAhorro();
		System.out.println();
		instancia2.mostrarInformacionPlazoFijo();
		
	}

}
