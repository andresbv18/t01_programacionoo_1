package pueba.uini;

import java.util.Scanner;

public class prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		do {
		 int opcion;
		 double ingreso,saldoActual = 3,retiro,saldo = 0;
		 Scanner entrada=new Scanner(System.in);
		 System.out.println("1. Ingresar dinero a la cuenta");
		 System.out.println("2. Cambiar calve.");
		 System.out.println("3. Bloquear cueta"); 
		 System.out.println("4.Salir"); 
		 System.out.print("Ingresar un numero:");
		 opcion=entrada.nextInt();
		 switch(opcion){
		 case 1 :
		 System.out.println("Digite la cantidad que desea ingresar en cuenta: ");
		 ingreso=entrada.nextDouble();
		 saldoActual=saldo_inicial+ingreso;
		 System.out.println("El saldo Actual es: " + 
		saldoActual);
		 break;
		 case 2 :
		 System.out.print("Digite la cantidad que desea retirar: ");
		 retiro=entrada.nextDouble();
		 if(retiro<=saldo_inicial){
		 saldoActual=saldo_inicial-retiro;
		 System.out.println("Dinero en cuenta: "+saldoActual);
		 }
		 else{
		 System.out.println("No cuenta con el saldo suficiente");
		 }
		 break;
		 case 3:
		 System.out.println("Su saldo es de: $"+saldoActual);
		 
		 break;
		 
		 case 4:
			 
	}while();

}}
