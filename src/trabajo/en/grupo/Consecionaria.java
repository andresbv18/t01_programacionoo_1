//1_Declaracion el paquete
package trabajo.en.grupo;

//2_Declaracion de la importacion
//3_Declaracion de comentarios
//4_Declaracion de la clasw
public class Consecionaria {
	// 5_Constantes
	// 6_Variables
	String Marca;
	String Color;
	String Modelo;
	int Año;
	String Kilometraje;
	int Npuertas;
	// 7_Constructor

	public Consecionaria() {
	}

	// 8_Metodos
	public void imprimir(String Marca, String Modelo, String Color, int Año, String Kilometraje, int Npuertas) {
		System.out.println(
				"*******************************************************************************************************************");
		System.out.println("CONSECIONARIO QUITO");
		System.out.println(
				"*******************************************************************************************************************");
		System.out.println("GAMA DE AUTOS DISPONIBLES EN EL PATIO: ");
		System.out.println("Marca: " + Marca + "\nModelo: " + Modelo + "\nColor: " + Color + "\nAño: " + Año
				+ "\nKilometraje: " + Kilometraje + "\nN° de Puertas: " + Npuertas);
	}

}
