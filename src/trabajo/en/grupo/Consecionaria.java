package trabajo.en.grupo;

public class Consecionaria {
	String Marca;
    String Color;
    String Modelo;
    int Año;
    String Kilometraje;
    int Npuertas;
 
    public void imprimir(String Marca, String Modelo, String Color, int Año, String Kilometraje, int Npuertas) {
        System.out.println("*******************************************************************************************************************");
        System.out.println("CONSECIONARIO QUITO");
        System.out.println("*******************************************************************************************************************");
        System.out.println("GAMA DE AUTOS DISPONIBLES EN EL PATIO: ");
        System.out.println("Marca: " + Marca + "\nModelo: " + Modelo + "\nColor: " + Color+"\nAño: "+Año+"\nKilometraje: "+Kilometraje+"\nN° de Puertas: "
        +Npuertas);
    }
 
}

