package deber.consultorio.matriz;

import java.util.Arrays;
import java.util.Scanner;

public class MainConsultorio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean salir = false;
		Scanner lector = new Scanner(System.in);

		int opcion;

		while (!salir) {
			System.out.println("1._Registrar paciente");
			System.out.println("2.-Imprimir reporte ");
			System.out.println("3.-Salir ");

			System.out.println("Ingresar opcion:");
			opcion = lector.nextInt();

			switch (opcion) {
			case 1:

				Scanner entra = new Scanner(System.in);
				Paciente p[] = new Paciente[5];

				String nombre = "";
				String apellido = "";
				int edad = 0;
				String sintoma = "";

				for (int i = 0; i < p.length; i++) {
					System.out.println("Nombre del paciente: ");
					nombre = entra.next();

					System.out.println("Apellido : ");
					apellido = entra.next();

					System.out.println("Edad : ");
					edad = entra.nextInt();

					System.out.println("Sintoma de: ");
					sintoma =entra.next();

					p[i] = new Paciente(nombre, apellido, edad, sintoma);

				}

				case2:

				System.out.println("Pacientes antes de ordenar");
				System.out.println(Arrays.toString(p));
				// Aqui ordeno la lista
				Arrays.sort(p);
				System.out.println("Pacientes  despues de ordenar");
				System.out.println(Arrays.toString(p));
				break;
			case 3:
				salir = true;
				System.out.println("Gracias por utilizar el programa!");
				break;

			}
		}
	}
}
