//Declaraciion del paquete
package ejercicios.metodos;

//2,Declaracion e importacion
//3,comentarios
//Clase que se encarda de la impreciion de formatos
//4,Declaracion de la clase
public class Impresora {
	// 5,Constantes
	// Variables
	public String color;

//7,Constructor
	public Impresora() {

	}// 8,Metodos

	public int imprimir(String datosAimprimir, int letra) {
		//Validacion de que existan materiaS
		System.out.println("Logo UCE");
		System.out.println("*************");
		System.out.println(datosAimprimir);
		System.out.println("*************");
		System.out.println("Pie de firma");
		return 7;
	}
}
