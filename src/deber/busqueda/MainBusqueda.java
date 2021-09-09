package deber.busqueda;

public class MainBusqueda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		do {

		
			int opcion1;
		
			Scanner entrada = new Scanner(System.in);
			
			System.out.println("Bienbenido:\n");
			System.out.println("1.Ingresar estudiante");
			System.out.println("2.Buscar estudiante");
			System.out.println("3.Salir");
	

			System.out.print("Ingresar un numero\n*");
			opcion1 = entrada.nextInt();
			switch (opcion1) {
			case 1:
				
			
				Estudiante estu1=new Estudiante();
				estu1.setCedula("493843758357");
                Estudiante estu2=new Estudiante();
				estu2.setCedula("58945804");
				Estudiante estu3=new Estudiante();
				estu3.setCedula("7540858");
				Estudiante estu4=new Estudiante();
				estu4.setCedula("4683246");
				Estudiante estu5=new Estudiante();
				estu5.setCedula("3243787");
			
				Estudiante e[]=new Estudiante[5];
				
			
					e[0] =estu1;
					e[1] =estu2;
					e[2] =estu3;
					e[3] =estu4;
					e[4] =estu5;
					
				
			
					

				
				
				break;
			case 2:
				String cedulaBuscar="1";
				boolean respuesta=false;
				for (int i=0;i<5;i++) {
					Estudiante estudiante=e[i];
					String cedulaEstudianteFila=estudiante.getCedula();
					boolean respuestaLocal=cedulaBuscar.equals(cedulaEstudianteFila);
					if(respuestaLocal==true) {
						respuesta=true;
						
					}
					
				
				if(respuesta==true) {	System.out.println("si");
					
				}else {System.out.println("no");
				
			break;
			case 3:
				
			
				return;

				
				
		}while(opcion1!=3);
	}

}
