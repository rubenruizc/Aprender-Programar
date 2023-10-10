package ejerciciosap;

import java.util.Scanner;

public class Ejercicio2AP {

	public static void main(String[] args) {
		int num1, num2, num3;
		Scanner sc = new Scanner(System.in);
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();

		if (num1 > 10 || num2 > 10 || num3 > 10) {
			System.out.println("ALGUNO MAYOR QUE 10");
		} else {
			System.out.println("NINGUNO MAYOR QUE 10");
		}

		// Cerramos el Scanner
		sc.close();
	} // Cierre main

}// Cierre clase
