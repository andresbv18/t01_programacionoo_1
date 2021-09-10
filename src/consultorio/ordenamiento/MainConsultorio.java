package consultorio.ordenamiento;


import java.util.Scanner;



public class MainConsultorio {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	     boolean salir = false;
	    Scanner Scan = new Scanner(System.in);
      
        int opcion;
        
        while (!salir){ 
            System.out.println("1._Registrar paciente");   
            System.out.println("2._eliminar paciente"); 
            System.out.println("3.-Imprimir reporte "); 
            System.out.println("4.-Salir ");
    



            System.out.println("Ingresar opcion:");
            opcion = Scan.nextInt();

                switch (opcion) {       
                    case 1:
                        // Nombre de la persona
                         System.out.println("Nombre del paciente: ");
                         String nombre = Scan.next();

                         System.out.println("Apellido : ");
                         String apellidos = Scan.next();


                         System.out.println("Edad : ");
                         int edad = Scan.nextInt();

                         
                         System.out.println("Sintoma de: ");
                         String sintoma = Scan.next();


                         //Llamamos a a los sets para ir introduciendo los valores.
                         p1.setNombre(nombre);
                         p1.setApellido(apellidos);
                         p1.setSintoma(sintoma);
                         p1.setEdad(edad);
                      
                         
                         p2.setNombre(nombre);
                         p2.setApellido(apellidos);
                         p2.setSintoma(sintoma);
                         p2.setEdad(edad);
                      
                         
                         
                         p3.setNombre(nombre);
                         p3.setApellido(apellidos);
                         p3.setSintoma(sintoma);
                         p3.setEdad(edad);
                    
                         
                         p4.setNombre(nombre);
                         p4.setApellido(apellidos);
                         p4.setSintoma(sintoma);
                         p4.setEdad(edad);
                        
                         p5.setNombre(nombre);
                         p5.setApellido(apellidos);
                         p5.setSintoma(sintoma);
                         p5.setEdad(edad);
                        
                         
                         p[0]=p1.setNombre(nombre);
                		 p[1]=p2;
                				 p[2]=p3;
                						 p[3]=p4;
                								 p[4]=p4;
                									Scanner entrada = new Scanner(System.in);
                									
                									

                									for (int i = 0; i < 3; i++) {
                										System.out.println("Ingrese el valor de la posicion :" + i);

                										 String Paciente = entrada.nextLine();}
                        										 
                        

                         System.out.println("Se ha gurdado de alta correctamente!");
                         break;

                    case 2:
                       
                        break;
                    case 3:

                       //Para mostrar la Persona que deseas.

                 

                    	

                									
                									// Recorriendo el vector lleno
                									for (int i = 0; i < 5; i++) {
                										System.out.println("el valor de la posicion :" + i);
                										System.out.println(p[i]);}

                         break;

                     case 4:
                       salir = true;
                       System.out.println("\033[31mGracias por utilizar el programa!");
                       break;
                }  
                }


	}
	}