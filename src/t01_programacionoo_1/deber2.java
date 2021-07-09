package t01_programacionoo_1;

import java.util.Scanner;

public class deber2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double numero1,numero2;
		Scanner lector= new Scanner(System.in);
		System.out.println("ingrese un numero");
   numero1=lector.nextInt();
   System.out.println("ingrese un numero");
   numero2=lector.nextDouble();
   if(numero1==0||numero2==0){
   System.out.println("El resultado es IMPOSIBLE");}
	else { System.out.println("El resultado es :"+numero1/numero2);}}}

	