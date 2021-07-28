package correcciones.de.pruebas;

import java.util.Scanner;

public class CorreccionPrueba1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stubint
		int num;
		 Scanner entrada=new Scanner(System.in);
		int s=0;
		float p=0f;
		int c=0;
		int i=0;
		
		
		 for( i=1;i!=0;i++) {
				
					System.out.print("Ingrese un numero positivo");	
					 num=entrada.nextInt();
					 if(num==0) {
						 i=-1;
					}else {
					s=s+num;
					 p=s/i;
					c=c+1;
					
		

	}

}
	System.out.println("La suma es"+s);
    System.out.println("El promedio es"+p);
    System.out.println("La cantidad es "+c);
    }}
