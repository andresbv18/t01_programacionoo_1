package deber.consultorio.ordenamiemto.copia;

import java.util.ArrayList;
import java.util.Scanner;

public class MainConsultorio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <PersonaRica> gente = new ArrayList<PersonaRica>(3);
        boolean salir = false;
        Scanner Scan = new Scanner(System.in);
        PersonaRica p1 = new PersonaRica();
        int opcion;




while (!salir){ 
            System.out.println("1.- Insertar una Persona");   
            System.out.println("2.- Eliminar una Persona"); 
            System.out.println("3.- Mostrar Personas ");
            System.out.println("4.- Salir ");



            System.out.println("[Indicame la Funcion]:");
            opcion = Scan.nextInt();

                switch (opcion) {       
                    case 1:
                        // Nombre de la persona
                         System.out.println("Nombre del alumno: ");
                         String nombre = Scan.next();

                         System.out.println("Apellido: ");
                         String apellidos = Scan.next();


                         System.out.println("Año de nacimiento: ");
                         int anynacimiento = Scan.nextInt();


                         System.out.println("Edad: ");
                         int edad = Scan.nextInt();


                         System.out.println("Dinero: ");
                         int dinero = Scan.nextInt();


                         System.out.println("Provincia: ");
                         String provincia = Scan.next();


                         System.out.println("Ciudad: ");
                         String ciudad = Scan.next();


                         System.out.println("DNI: ");
                         String dni = Scan.next();



                         //Llamamos a a los sets para ir introduciendo los valores.
                         p1.setNombre(nombre);
                         p1.setApellido(apellidos);
                         p1.setAnyoNacimiento(anynacimiento);
                         p1.setEdad(edad);
                         p1.setDinero(dinero);
                        
                         gente.add(p1);

                         System.out.println("Se ha dado de alta correctamente!");
                         break;

                    case 2:
                        String nombre1;


                        System.out.println("El Nombre ha eliminar: ");
                        nombre1 = Scan.next();

                        for (PersonaRica persona: gente) {
                            if(p1.getNombre().equals(nombre1)){             
                                    gente.remove(p1);
                                    System.out.println("Se ha eliminado correctamente!");

                                 }else {

                                     System.out.print("No se ha encontrado la persona.....");                                
                                 }
                            }
                        break;
                    case 3:

                       //Para mostrar la Persona que deseas.

                        for (int i = 0; i < gente.size(); i++) {
                                System.out.println("Persona: " + gente.get(i));
                           
                                break;
                            }

                         break;

                     case 4:
                       salir = true;
                       System.out.println("\033[31mGracias por utilizar el programa!");
                       break;
                }  
                }



   }




	}


