package ejercicios.varios.vectores.matrices;

import java.util.Scanner;

public class MainMatriz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Declare una matriz de A[3][4] de 3 filas y 4 columnas y desatrrolle un programa que vaya solicitando cada una de las posiciones.
		
		char A[][] = new char[3][4];
		for (int fila = 0; fila < 3; fila++) {

			for (int columna = 0; columna < 4; columna++) {
				System.out.println("Ingrese el valor fila :" + fila + " Y columna :" + columna);
				// El usuario digita el valor por teclado
				Scanner entrada = new Scanner(System.in);
				char n = entrada.next().charAt(0);
				A[fila][columna] = n;
			}
		}
		for (int fila = 0; fila < 3; fila++) {
			for (int columna = 0; columna < 4; columna++) {

				System.out.print(A[fila][columna]+" ");
			}
			System.out.println();
		}
	}
}