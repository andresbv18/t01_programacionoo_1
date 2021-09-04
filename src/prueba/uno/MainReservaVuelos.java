package prueba.uno;

import java.util.Scanner;

public class MainReservaVuelos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lectorint = new Scanner(System.in);
		Scanner lectorString = new Scanner(System.in);

		System.out.println("Ingrese informacion del pasajero");
		System.out.println("Ingrese nombre");
		String nombre = lectorString.nextLine();
		System.out.println("Ingrese Apellido");
		String apellido = lectorString.nextLine();
		System.out.println("Ingrese edad");
		int edad = lectorint.nextInt();
		System.out.println("Que tipo de pasajero es :1;pasajero vip:2:pasajero economico");
		int opcion = lectorint.nextInt();
		String membresia = "";
		String descuento = "";
		if (opcion == 1) {
			System.out.println("Ingrese codigo de membresia");
			membresia = lectorString.nextLine();
		} else {
			System.out.println("Ingrese codigo de descuento");
			descuento = lectorString.nextLine();
		}

		PasajeroVip pasajero1 = new PasajeroVip();
		pasajero1.setNombre("Daniel");
		pasajero1.setApellido("Teran");
		pasajero1.setEdad(21);
		pasajero1.setCodigoMembresia("ambb34m");

		PasajeroVip pasajero2 = new PasajeroVip("Carlos", "Prez", "vsbdhgw3", 23);

		PasajeroEconomico pasajeroe1 = new PasajeroEconomico();
		pasajeroe1.setNombre("EDison");
		pasajeroe1.setApellido("Cayambe");
		pasajeroe1.setEdad(23);
		pasajeroe1.setCodigoDescuento("jdkn3j");

		PasajeroEconomico pasajeroe2 = new PasajeroEconomico();
		pasajeroe2.setNombre("EDison2");
		pasajeroe2.setApellido("Cayambe3");
		pasajeroe2.setEdad(23);
		pasajeroe2.setCodigoDescuento("jdkn3j4");
		Pasajero[][] asientos = new Pasajero[4][5];
		asientos[0][0] = pasajero1;
		asientos[0][1] = pasajero2;
		asientos[0][2] = pasajeroe1;
		asientos[3][2] = pasajeroe2;
		int opcionSalir = 0;
		do {
			System.out.println("Ingrese datos del asiento, continuar,-1 salir");
			opcionSalir = lectorString.nextInt();

			if (opcionSalir == 0) {
				System.out.println("Ingrese fila");
				int fila = lectorString.nextInt();
				System.out.println("Ingrese columna");
				int columna = lectorString.nextInt();

				System.out.println("Los datos el pasajero son");
				System.out.println(asientos[fila][columna]);

			} else if (opcionSalir == -1) {
				System.out.println("salir");

			}
		} while (opcionSalir != -1);

	}
}
