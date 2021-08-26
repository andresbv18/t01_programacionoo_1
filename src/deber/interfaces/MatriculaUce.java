package deber.interfaces;

public class MatriculaUce implements MatriculaInterfaz {

	@Override
	public void solicitarCredencial() {
		// TODO Auto-generated method stub
		System.out.println("Digite si ID");
	}

	@Override
	public void validarDatos() {
		// TODO Auto-generated method stub
		//si consta en el sisitema como alumno
		System.out.println("Escoja un aopcion");
		System.out.println("Revisar notas");
		System.out.println("Matricula");
	}

	@Override
	public void verificarNotas() {
		// TODO Auto-generated method stub
		//Si se a aprobado las materias
		System.out.println("Escoja las materias a matriculkarse");
		System.out.println("Programacion");
		System.out.println("Algreba");
		System.out.println("Fisica");
	}

	@Override
	public void verificarHorarios() {
		// TODO Auto-generated method stub
		//Si no existe choque de horarios
		System.out.println("Su matricula se ha generado");
		//else
		//eliminar materias
	}

	@Override
	public void eliminarMaterias() {
		// TODO Auto-generated method stub
		System.out.println("Escoja las meterias a cambiar de paralelo");
	}

	@Override
	public void generarMatricula() {
		// TODO Auto-generated method stub
		System.out.println("Su matricula se ha generado");
	}

}
