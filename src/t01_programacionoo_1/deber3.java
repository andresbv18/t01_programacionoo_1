package t01_programacionoo_1;

import java.util.Scanner;

public class deber3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero1,numero2;
		Scanner lector= new Scanner(System.in);
		System.out.println("ingrese un numero");
   numero1=lector.nextInt();
   System.out.println("ingrese un numero");
   numero2=lector.nextInt();
if(numero1%numero2==0){
   System.out.println("El numero A es multiplo de B:");}
	else { System.out.println("El numero A no es multiplo de b:");}
   }
	
}
	