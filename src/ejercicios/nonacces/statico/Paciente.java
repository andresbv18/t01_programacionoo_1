package ejercicios.nonacces.statico;

public class Paciente {
	
	private String nombre;
private  int edad;
private static int edadLimite=65;
private static String nacionalidad="Ecuatoriano";

public void registrar(String nombre) {
	System.out.println("Se registra el paciente: "+nombre);
}private static void consultarNacionalida() {
	System.out.println("Ingrese el valor del vector");
}public static void consultarNacionalidad() {
	System.out.println("La nacionalidad de"+nacionalidad);
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public int getEdad() {
	return edad;
}
public void setEdad(int edad) {
	this.edad = edad;
	
	
}

}
