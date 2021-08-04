package ejercicios.varios.vectores.matrices;

import java.util.Scanner;

public class MainVector1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 3. Declarar un vector X[3] de tipo char y contruya un programa que pida al
		// usuario

		// que ingrese valores para cadad posicion .
		// y finalmente que se imprima todos los valores ingresados

		Scanner entrada = new Scanner(System.in);
		char n;
		char X[] = new char[3];

		for (int i = 0; i < 3; i++) {
			System.out.println("Ingrese el valor de la posicion :" + i);

			n = entrada.next().charAt(0);

			X[i] = n;
		} // Recorriendo el vector lleno
		for (int i = 0; i < 3; i++) {
			System.out.println("el valor de la posicion :" + i);
			System.out.println(X[i]);
		}

	}
}
