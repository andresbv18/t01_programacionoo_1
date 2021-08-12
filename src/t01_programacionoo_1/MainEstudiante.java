package t01_programacionoo_1;

public class MainEstudiante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Estudiante estudiante1 = new Estudiante();
		estudiante1.apellido = "Perez";
		estudiante1.Nombre = "Juan";
		estudiante1.edad = 32;
		estudiante1.cedula = "01758030";
		estudiante1.genero = "Masculino";
		estudiante1.comer();
		estudiante1.estudiar();
		estudiante1.matricularse();
		System.out.println("segunda INSTANCIA");

		Estudiante estudiante2 = new Estudiante();
		estudiante2.apellido = "Paz";
		estudiante2.Nombre = "Andrea";
		estudiante2.edad = 25;
		estudiante2.cedula = "0106758030";
		estudiante2.genero = "F";
		estudiante2.comer();
		estudiante2.estudiar();
		estudiante2.matricularse();
	}

}
