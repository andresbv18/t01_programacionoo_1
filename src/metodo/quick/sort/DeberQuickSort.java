package metodo.quick.sort;

import java.util.Arrays;
import java.util.Scanner;

public class DeberQuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner lector = new Scanner(System.in);
			System.out.print("Ingrese la longitud del vector ");
			int a = lector.nextInt();

			 int X[] = new int[a];
			for (int i = 0; i < a; i++) {
			System.out.print("Ingrese valor de la posición " + i + ": ");
			int n = lector.nextInt();
			X[i] = n;
			}
			for (int i = 0; i < a; i++) {
			System.out.print("El valor de la posición " + i + ": ");
			System.out.println(X[i]);
			}
			quicksort(X, 0, a - 1);
			System.out.println("Impresión de la matriz ordenada de menor a mayor:");

			 for (int n = 0; n < a; n++) {

			 System.out.print(X[n] + " ");
		
			 
			} 
			 System.out.println("\nOrdenamiento de java");
			 System.out.println("El vector antes de ordenar"+Arrays.toString(X));
			 Arrays.sort(X);
			 System.out.println("El vector despues de ordenar"+Arrays.toString(X));
			}

			 public static void quicksort(int[] vector, int izquierda, int derecha) {
			int pivote = vector[(izquierda + derecha) / 2];
			int i = izquierda;
			int j = derecha;

			 do {
			while (vector[i] < pivote)
			i++;
			while (vector[j] > pivote)
			j--;
			if (i <= j) {
			int auxiliar = vector[i];
			vector[i] = vector[j];
			vector[j] = auxiliar;
			i++;
			j--;
			}
			} while (i <= j);
			if (izquierda < j)
			quicksort(vector, izquierda, j);
			if (i < derecha)
			quicksort(vector, i, derecha);
			
			
			}
			 
			}
	