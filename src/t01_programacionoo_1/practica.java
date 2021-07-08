package t01_programacionoo_1;

import java.util.Scanner;

public class practica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1;
		int B=40;
		Scanner lector=new Scanner(System.in);
		System.out.println("Ingreseun numero: ");
		n1=lector.nextInt();
	
		if(n1<300) {
			System.out.println("su bonificacion es: "+B);
	}else{System.out.println("Su bonificacion es: 0");


	}

}
}