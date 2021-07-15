package diagramas.de.flujo;

import java.util.Scanner;

public class main4figura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner entrada = new Scanner(System.in);
		System.out.print("Ingrese un numero: ");
		num = entrada.nextInt();

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println("");

		}
	}
}