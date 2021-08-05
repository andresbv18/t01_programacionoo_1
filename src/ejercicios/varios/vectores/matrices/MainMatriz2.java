package ejercicios.varios.vectores.matrices;

import java.util.Scanner;

public class MainMatriz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Desarrollar un programa que imprima la siguiente imagen 

		int fila;
		int columna;

		int A[][] = new int[5][5];

		for (fila = 0; fila < 5; fila++) {

			for (columna = 0; columna < 5; columna++) {

				if (fila == columna) {

					A[fila][columna] = 1;

				}

				else {
					A[fila][columna] = 0;
				}
			

				System.out.print(A[fila][columna] + " ");

			}
			System.out.println();
		}
	}
}