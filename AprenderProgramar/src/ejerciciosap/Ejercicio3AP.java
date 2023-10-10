package ejerciciosap;

import java.util.Scanner;

public class Ejercicio3AP {

	public static void main(String[] args) {
		int dia, mes;
		Scanner sc = new Scanner(System.in);
		dia = sc.nextInt();
		mes = sc.nextInt();

		if (dia == 25 && mes == 12) {
			System.out.println("SI");
		} else {
			System.out.println("NO");
		}

		// Cerramos el Scanner
		sc.close();
		
	}// Cierre main
	
}// Cierre clase
