package t01_programacionoo_1;

public class Estudiante {
	//PROPIEDADES
	String Nombre;
	String apellido;
	String cedula;
	int edad;
	String genero;
	
	//ACCIONES/METODOS
	void comer(){
		System.out.println("Esta comiendo :"+Nombre);
		
	}
	
	void estudiar() {
		System.out.println("Esta estudiando : "+apellido);

}
	void matricularse() {
		System.out.println("su cedula es: "+cedula);
		
		// buscar en la base de datos
		// verificar pago
		//verificar si paso el semestre
		// imprimir un voucher
}}