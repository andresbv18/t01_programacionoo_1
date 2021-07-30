package diagramas.de.flujo;

import java.util.Scanner;

public class Main10WhilePrueba1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Ingrese un numero positivo");
		int m=0;
		float p=0;
		int c=0;
		int i=0;
		int n = entrada.nextInt();

		while (n != 0) {


m=m+n;
c=c+1;
p=m/c;


			System.out.print("Ingrese un numero positivo");
		
			n = entrada.nextInt();

		
		}
		System.out.println("La suma es " + m);
		System.out.println("El promedio es " + p);
		System.out.println("La cantidad es " + c);
	}
}
