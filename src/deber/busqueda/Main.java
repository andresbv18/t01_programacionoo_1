package deber.busqueda;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion = 0;
		do {

			Scanner entrada = new Scanner(System.in);
			System.out.println("Bienvenido:\nseleccione una opcion:\n");
			System.out.println("1. Ingresar estudiante");
			System.out.println("2.Buscar estudiante");
			System.out.println("3.Salir");

			System.out.print("Ingresar un numero\n*");
			opcion = entrada.nextInt();
			switch (opcion) {
			case 1:
				System.out.print("Digite la cedula del estudiante: ");
				Scanner cedula = new Scanner(System.in);
				Estudiante estu = new Estudiante();

				String X[] = new String[5];

				for (int i = 0; i < 5; i++) {
					System.out.println("Ingrese la cedula" + i);

					String n = cedula.nextLine();

					X[i] = n;
				} // Recorriendo el vector lleno
				for (int i = 0; i < 5; i++) {
					System.out.println("el valor de la posicion :" + i);

				}
				break;
			case 2:
			
				String frase = "cedula"+entrada;
				Scanner entrada2 = new Scanner(System.in);
				System.out.print("Ingrese cedula");
				String palabra = entrada2.nextLine();

				boolean resultado = frase.contains(palabra);
				System.out.print("Contiene la palbra" + resultado);
				break;

			case 3:
				return;

			}

		} while (opcion != 3);

	}

}
