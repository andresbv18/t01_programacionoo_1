package ejercicios.varios.vectores.matrices;

import java.util.Scanner;

public class MainTallerMatrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Teclado = new Scanner(System.in);
		
		//filas
		System.out.println("Ingrese el numero de filas del vector");
		int longitudfila = Teclado.nextInt();
		
		
		System.out.println("Ingrese el numero de columnas del vector");
		//columnas
		int longitudcolumna = Teclado.nextInt();
		
		
		char A[][] = new char[longitudfila][longitudcolumna];
		for (int fila = 0; fila < longitudfila; fila++) {

			for (int columna = 0; columna < longitudcolumna; columna++) {
				System.out.println("Ingrese el valor fila :" + fila + " Y columna :" + columna);
				// El usuario digita el valor por teclado
				Scanner entrada = new Scanner(System.in);
				char n = entrada.next().charAt(0);
				A[fila][columna] = n;
			}
		}
		
		}
	}
}
	
