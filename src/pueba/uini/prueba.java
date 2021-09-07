package pueba.uini;

import java.util.Scanner;

public class prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion = 0;
		do {

			final int saldo_inicial = 1000;
			int opcion1;
			double ingreso, saldoActual = 0, retiro, saldo = 0;
			Scanner entrada = new Scanner(System.in);
			System.out.println("Banco del Pichicaha:\nseleccione una opcion:\n");
			System.out.println("1. Retirar dinero de la cuenta");
			System.out.println("2.Cambiar clave");
			System.out.println("3.Bloquear cuenta");
			System.out.println("4.Salir\n");

			System.out.print("Ingresar un numero\n*");
			opcion1 = entrada.nextInt();
			switch (opcion1) {
			case 1:
				System.out.print("Digite la cantidad que desea retirar: ");
				retiro = entrada.nextDouble();
				if (retiro <= saldo_inicial) {
					saldoActual = saldo_inicial - retiro;
					System.out.println("Dinero en cuenta: " + saldoActual);
				}
				break;
			case 2:
				System.out.println("Digite su nueva clave");
				int n = (int) entrada.nextDouble();
				System.out.println("Su nueva clave es :" + n);
				break;
			case 3:
				System.out.println("Su Cuenta ha sido Bloqueada");

				break;
			case 4:
				return;

			}

		} while (opcion != 4);

	}
}
