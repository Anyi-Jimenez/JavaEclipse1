package operadoresLogicos;

import java.util.Scanner;

public class ejerciciosOperadoresLogicos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Los operadores lógicos se utilizan para cobinar valores booleanos y nos devuelven un resultado verdadero, falso o nulo. */
		//&& and (Y)
		//|| or (O)
		//! not (not)
		
		//int a = 5;
		//int b = 3;
		
		/*System.out.println( a == b && a > b);
		System.out.println( !(a == b) && a > b);
		System.out.println( a == b || a > b);*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingresa el primer número ");	
		int num1= sc.nextInt();
		
		System.out.println("Ingresa el segundo número ");
		int num2= sc.nextInt();
			
		if (num1%2==0 && num2%2==0) {
			System.out.println("Los numeros son pares");
		} else if(num1%2==0 && num2%2==1){
			System.out.println("El primer numero es par");
		} else if(num1%2==1 && num2%2==0){
			System.out.println("El segundo numero es par");
		} else {
			System.out.println("Los numeros son impares");
		}
		
		sc.close();
		
		
		

	}

}
