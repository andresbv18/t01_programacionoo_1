//1,Declaracion de paquete
package estructura.clase;

//2,Declararcion ed impportacion
import java.util.Scanner;

//3,comentarios clase que me sirve para guardar los daatos del estudiante

//4,Declaracion de la clase
public class Estudiante {
	Scanner lector = new Scanner(System.in);
	// Las clases que estan dentro del mismo paquete norequieeren importacion

	// 5,Constantes
	public final int Mese_ANIO = 12;
	// 6,Atributos o variables
	public String nombre;
	public String apellido;
	public int edad;
	// 7,constructor
public Estudiante(){
	// 8, Metodos
}
	public int matricular() {
		//Programar todo lo que implica el matricular
		//Insertar en la base
		//Valide si pase las materias
		//El numero de matricula ;573
		return 573;
	}
	public void imprimir(String datosImprimir) {
		//Datos de maricula
		//Datos de la s notas
		//Color 
		//Pocion
	}
}