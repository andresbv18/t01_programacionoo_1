package diagramas.de.flujo;

import java.util.Scanner;

public class Main7WHImpares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero;
		Scanner lector= new Scanner(System.in);
		 System.out.print("Ingresen un numero");
		numero=lector.nextInt();

		 int i=-1;
	while(i!=numero)
		System.out.println("*");
	numero=lector.nextInt();
	{int R=i+numero;
	 System.out.println(R);
	 i=i+1;
	 if(R==7||R==17) {
		 System.out.println("*"+R);
	 }
	}
	}

}


	
