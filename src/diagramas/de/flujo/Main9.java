package diagramas.de.flujo;

import java.util.Scanner;

public class Main9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner entrada=new Scanner(System.in);
			int num = 0;
	int sp=0;
	int si =0;
	int ci=0;
	float pi=0f;

	while(num!=-1) {
		
		System.out.print("Ingrese un numero positivo");	
		 num=entrada.nextInt();
	if(num==-1) {
			
		 }	else if  (num %2==0) {
			 sp=sp+num;
			
			 
		 
		 } else { 
			
			 si =si+num;
			 ci=ci+1;
			 pi=si/ci;
		 }
	}


	System.out.println("La suma de los pares es"+sp);	
	System.out.println("El promedo de los impares es "+pi);	
	}}
	