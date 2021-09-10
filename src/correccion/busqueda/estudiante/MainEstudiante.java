package correccion.busqueda.estudiante;

import java.util.Scanner;

public class MainEstudiante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion = 0;
		do {

			int opcion1;
			Scanner entrada = new Scanner(System.in);

			System.out.println("Bienbenido:\n");
			System.out.println("1.Ingresar estudiante");
			System.out.println("2.Buscar estudiante");
			System.out.println("3.Salir");

			System.out.print("Ingresar un numero\n*");
			opcion1 = entrada.nextInt();
			switch (opcion1) {
			case 1:
				Estudiante estu1 = new Estudiante();
				estu1.setCeduala("493843758357");
				Estudiante estu2 = new Estudiante();
				estu2.setCeduala("58945804");
				Estudiante estu3 = new Estudiante();
				estu3.setCeduala("7540858");
				Estudiante estu4 = new Estudiante();
				estu4.setCeduala("4683246");
				Estudiante estu5 = new Estudiante();
				estu5.setCeduala("3243787");

				Estudiante fila[] = new Estudiante[5];

				fila[0] = estu1;
				fila[1] = estu2;
				fila[2] = estu3;
				fila[3] = estu4;
				fila[4] = estu5;

			
				String cedulaBuscar = "16787";
				boolean respuesta = false;
				for (int i = 0; i < 5; i++) {
					Estudiante estudiante = fila[i];
					String cedulaEstudianteFila = estudiante.getCeduala();
					boolean respuestaLocal = cedulaBuscar.equals(cedulaEstudianteFila);
					if (respuestaLocal == true) {
						respuesta = true;

					}

					if (respuesta == true) {
						System.out.println("si");

					} else {
						System.out.println("no");
					}

					break;
				}
			case 3:

				break;
				

			}

		} while (opcion!= 3);

	}
}
