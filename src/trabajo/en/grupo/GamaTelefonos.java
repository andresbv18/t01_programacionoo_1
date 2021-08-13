//1_Declaracion de paquete
package trabajo.en.grupo;

//2_Declaracion de importacion
//3_Declaracuon de comentarios 
//4_Declaracion de clasde
public class GamaTelefonos {
	// Atributos
	// 5_Declaracion de constantes
	// 6_Variables

	String Marca;
	String Color;
	String Modelo;
	int imei;
	String Camara;
	String Almacenamiento;
	String Ram;
	String Procesador;

	// 7_Constructor
	public GamaTelefonos() {
	}

	// 8_Metodos
	public void imprimir(String Marca, String Modelo, String Color, int imei, String Camara, String Almacenamiento,
			String Ram, String Procesador) {
		System.out.println(
				"*******************************************************************************************************************");
		System.out.println("IMPORTADORA POWERGAMA");
		System.out.println(
				"*******************************************************************************************************************");
		System.out.println("La Gama De Celulares disponibles son: ");
		System.out.println("Marca: " + Marca + "\nModelo: " + Modelo + "\nColor: " + Color + "\nImei: " + imei
				+ "\nCamara: " + Camara + "\nAlmacenamiento: " + Almacenamiento + "\nRam: " + Ram + "\nProcesador: "
				+ Procesador);
	}
}
