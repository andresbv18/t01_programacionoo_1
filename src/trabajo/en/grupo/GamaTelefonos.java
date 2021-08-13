package trabajo.en.grupo;

public class GamaTelefonos {
	//2.Atributos
	 
    String Marca;
    String Color;
    String Modelo;
    int imei;
    String Camara;
    String Almacenamiento;
    String Ram;
    String Procesador;
 
    public void imprimir(String Marca, String Modelo, String Color, int imei, String Camara, String Almacenamiento,
            String Ram, String Procesador) {
        System.out.println("*******************************************************************************************************************");
        System.out.println("IMPORTADORA POWERGAMA");
        System.out.println("*******************************************************************************************************************");
        System.out.println("La Gama De Celulares disponibles son: ");
        System.out.println("Marca: " + Marca + "\nModelo: " + Modelo + "\nColor: " + Color+"\nImei: "+imei+"\nCamara: "+Camara+"\nAlmacenamiento: "+Almacenamiento+"\nRam: " + Ram +"\nProcesador: "+ Procesador);
    }
}
	

