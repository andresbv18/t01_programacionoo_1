package diagramas.de.flujo;

import java.util.Scanner;

public class main8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//se debe ingresar por teclado un numero mayor a ceero mientras no sea asi el programa debe solicitar que sea mayor a cero cuando sea asi el programa validara si es par o impar 
		Scanner lector= new Scanner(System.in);
		int numero;
		 System.out.print("Ingresen un numero");
		 numero=lector.nextInt();


	while(numero!=0) {
		
	System.out.print("Ingresen un numero correcto");
	
	numero=lector.nextInt();
	
		
	

}
	System.out.print(" numero correcto");//contruya un programa que valide el uso de enteros ssi se ingresa un jumero entre uno y 10 se debe imprimir numero correcto si no esta debera solicitar entre 1 y 10
}}