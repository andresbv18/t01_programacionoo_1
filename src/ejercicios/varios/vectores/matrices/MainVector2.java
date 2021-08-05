package ejercicios.varios.vectores.matrices;

import java.util.Scanner;

public class MainVector2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 3. Declarar un vector X[] cuya longitud se solicite al usuario de tipo int y contruya un programa que pida al
				// usuario

				// que ingrese valores para cadad posicion .
				// y finalmente que se imprima todos los valores ingresados

				Scanner entrada = new Scanner(System.in);
				int n;
				int n1 = 0 ;
				System.out.println("Ingrese el valor del vector");
				int X[] = new int[n1];
				n1 = entrada.nextInt();
				
				
				for (int i = 0; i < X[n1]; i++) {
					Scanner entrada1 = new Scanner(System.in);
					System.out.println("Ingrese el valor de la posicion :" + i);

					n = entrada1.nextInt();

					X[i] = n;
				} // Recorriendo el vector lleno
				for (int i = 0; i < 3; i++) {
					System.out.println("el valor de la posicion :" + i);
					System.out.println(X[i]);
				}

	}}
	
