package t01_programacionoo_1;

import java.util.Scanner;

public class deber1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1;
		int b1=100;
		int b2=75;
		int b3=50;
		Scanner lector=new Scanner(System.in);
		System.out.println("Ingrese el valor de su sueldo: ");
		n1=lector.nextInt();
	
		if(n1<300) {
			System.out.println("su bonificacion es: "+b1);
			int suma1=n1+b1;
			System.out.println("su sueldo total es: "+suma1);
	}else if(n1>=300&&n1<400){
		System.out.println("Su bonificacion es:"+b2);
		int suma2=n1+b2;
		System.out.println("Su sueldo total es:"+suma2);

	}else if(n1>=400){
		
	System.out.println("Su bonificacion es:"+b3);
		int suma3=n1+b3;
		System.out.println("Su sueldo total es:"+suma3);

}}
}