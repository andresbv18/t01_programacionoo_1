package diagramas.de.flujo;

import java.util.Scanner;

public class main6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero;
		Scanner lector= new Scanner(System.in);
		 System.out.print("Ingresen un numero");
		numero=lector.nextInt();

		 int i=1;
	while(i<=numero)
		
	{int R=i*2;
	 System.out.println(R);
	 i=i+1;
	}

}
}// se ingresa por tec2lado uyn numero n el cual indica el total de numeros pares consecutivos a imprimir
//se ingresa por tec2lado uyn numero n el cual indica el total de numeros impares consecutivos a imprimir
//cuando se vaya imprimir el numero 7 17 7 0 27 se imprimira con un asterisco al inicio