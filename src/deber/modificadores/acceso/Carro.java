package deber.modificadores.acceso;

public class Carro {
	private int numserie;
	public String modelo;
	int numllantas;
	protected String color;private String Marca;
	public String Color;
	protected String Modelo;
	int A�o;
	String Kilometraje;
	int Npuertas;



	public void imprimir(String Marca, String Modelo, String Color, int A�o, String Kilometraje, int Npuertas) {
		System.out.println(
				"***************************************************");
		System.out.println("MAB motors");
		System.out.println(
				"***************************************************");
		System.out.println("GAMA DE AUTOS DISPONIBLES EN EL PATIO: ");
		System.out.println("Marca: " + Marca + "\nModelo: " + Modelo + "\nColor: " + Color + "\nA�o: " + A�o+ "\nKilometraje: " + Kilometraje + "\nN� de Puertas: " + Npuertas);
	}



public void acelerar() {
}
}