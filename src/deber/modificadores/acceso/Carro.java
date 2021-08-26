package deber.modificadores.acceso;

public class Carro {
	private int numserie;
	public String modelo;
	int numllantas;
	protected String color;private String Marca;
	public String Color;
	protected String Modelo;
	int Año;
	String Kilometraje;
	int Npuertas;



	public void imprimir(String Marca, String Modelo, String Color, int Año, String Kilometraje, int Npuertas) {
		System.out.println(
				"***************************************************");
		System.out.println("MAB motors");
		System.out.println(
				"***************************************************");
		System.out.println("GAMA DE AUTOS DISPONIBLES EN EL PATIO: ");
		System.out.println("Marca: " + Marca + "\nModelo: " + Modelo + "\nColor: " + Color + "\nAño: " + Año+ "\nKilometraje: " + Kilometraje + "\nN° de Puertas: " + Npuertas);
	}



public void acelerar() {
}
}