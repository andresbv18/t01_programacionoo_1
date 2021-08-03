package diagramas.de.flujo;

import java.util.Scanner;

public class Main11Cubo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int control,num,cubo;
          Scanner entrada=new Scanner(System.in);
          control=1; //valor de arranque de la variable
           while(control<=5) //condición
              {
                  System.out.println("Dame número");
                  num=entrada.nextInt();
                  cubo=num*num*num;
                  System.out.println("El cubo de "+num+" es "+cubo);
                  control++;  //control de la variable
              } //while
       }//main
 }//class
	
