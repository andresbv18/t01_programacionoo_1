package metodo.quick.sort;

import java.util.Arrays;
import java.util.Scanner;

public class MainQuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Teclado = new Scanner(System.in);

		// filas
		System.out.println("Ingrese el valor del vector");
		int longitudvector = Teclado.nextInt();

		int A[] = new int[longitudvector];

		for (int i = 0; i < longitudvector; i++) {

			System.out.println("Ingrese el valor del vector:" + i);
			// El usuario digita el valor por teclado
			Scanner entrada = new Scanner(System.in);
			int n = entrada.nextInt();
			A[i] = n;

		}
		MetodoQuickSort a = new MetodoQuickSort();
		a.ordenarQuicksort(A);
		for (int i = 0; i < longitudvector; i++) {

			System.out.print(A[i] + " ");
			System.out.println("El vector antes de ordenar"+Arrays.toString(A));
			 Arrays.sort(A);
			 System.out.println("El vector antes de ordenar"+Arrays.toString(A));
		}

	}
}