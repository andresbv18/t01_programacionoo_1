package deber.ejercicio.ordenamiento;

import java.util.Arrays;

public class MainGpf {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleado Juan = new Empleado();
		Juan.setNombre("Juan");
		Juan.setApellido("Ramirez");
		Juan.setEdad(24);
		Juan.setSalario(234);

		Empleado Carlos = new Empleado();
		Carlos.setNombre(" Carlos ");
		Carlos.setApellido(" Gonzales");
		Carlos.setEdad(34);
		Carlos.setSalario(456);

		Empleado Jacinto = new Empleado();
		Jacinto.setNombre("Jacinto ");
		Jacinto.setApellido("Perez ");
		Jacinto.setEdad(23);
		Jacinto.setSalario(198);

		Empleado Pedro = new Empleado();
		Pedro.setNombre("Pedro ");
		Pedro.setApellido(" Zalazar");
		Pedro.setEdad(28);
		Pedro.setSalario(567);

		Empleado Fredy = new Empleado();
		Fredy.setNombre("Fredy");
		Fredy.setApellido("Bonilla");
		Fredy.setEdad(27);
		Fredy.setSalario(423);

		Empleado Marcelo = new Empleado();
		Marcelo.setNombre("Marcelo ");
		Marcelo.setApellido("Torres");
		Marcelo.setEdad(35);
		Marcelo.setSalario(654);

		Empleado Bolivar = new Empleado();
		Bolivar.setNombre("Bolivar ");
		Bolivar.setApellido("Abad");
		Bolivar.setEdad(45);
		Bolivar.setSalario(512);

		Empleado Patricia = new Empleado();
		Patricia.setNombre("Patricia");
		Patricia.setApellido("Huertas");
		Patricia.setEdad(33);
		Patricia.setSalario(432);

		Empleado Ana = new Empleado();
		Ana.setNombre("Ana");
		Ana.setApellido("Heredia ");
		Ana.setEdad(42);
		Ana.setSalario(234);

		Empleado Maria = new Empleado();
		Maria.setNombre("Maria ");
		Maria.setApellido("Hortega");
		Maria.setEdad(23);
		Maria.setSalario(876);

		Empleado listaEmpleados[] = new Empleado[10];
		listaEmpleados[0] = Juan;
		listaEmpleados[1] = Carlos;
		listaEmpleados[2] = Jacinto;
		listaEmpleados[3] = Pedro;
		listaEmpleados[4] = Fredy;
		listaEmpleados[5] = Marcelo;
		listaEmpleados[6] = Bolivar;
		listaEmpleados[7] = Patricia;
		listaEmpleados[8] = Ana;
		listaEmpleados[9] = Maria;

		System.out.println("Vector antes de ordenar");
		System.out.println(Arrays.toString(listaEmpleados));
		Arrays.sort(listaEmpleados);
		System.out.println("Vector despues de ordenar");
		System.out.println(Arrays.toString(listaEmpleados));
	}

}
