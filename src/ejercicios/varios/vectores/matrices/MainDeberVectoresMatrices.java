package ejercicios.varios.vectores.matrices;

public class MainDeberVectoresMatrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   //1.Declarar un vector X[8] de tipo int
		int X[] = new int[8];
		// 2.DEclarar un vector M[3] y asiganar a al posicion 2 el valor de A:
		char M[] = new char[3];
		M[2] = 'A';
		//3. Declarar un vector A[5] asignar a la aposicion 0 el valor de 25, posicion 3
		// el valor de 49, y a la posicion 2 el valor de la posicion 0
		int A[] = new int[5];
		A[0] = 25;
		A[2] = 49;
		A[3] = A[0];
		// 4.DEclarar un vector B[10], a la posicon B[0] asigne el valor de la posicion
		// del vector A[3] del ejercicio anterior
		int B[] = new int[10];
		B[0] = A[3];
		// 5.Declarar un vectorz[12] asignar a todas las posiciones valores que inician
		// desde 1 y son secuenciales
		int Z[] = new int[12];
		Z[0] = 1;
		Z[1] = 2;
		Z[2] = 3;
		Z[3] = 4;
		Z[4] = 5;
		Z[5] = 6;
		Z[6] = 7;
		Z[7] = 8;
		Z[8] = 9;
		Z[9] = 0;
		Z[10] = 11;
		Z[11] = 12;
		// 6.Declarar un vector de Y(10) y asinar a todas sus possiciciones valores que
		// inician desde 1 y son secuenciales
		int Y[] = new int[12];
		Y[0] = 1;
		Y[1] = 3;
		Y[2] = 5;
		Y[3] = 7;
		Y[4] = 9;
		Y[5] = 11;
		Y[6] = 13;
		Y[7] = 15;
		Y[8] = 17;
		Y[9] = 19;
		

		//7. Declarar un vertor H(10) y asignar solo a las posisiones impares letras que
		// inician desde la A

		char H[] = new char[10];
		H[1] = 'A';
		H[3] = 'B';
		H[5] = 'C';
		H[7] = 'D';
		H[9] = 'E';

		// 8.Declarar un vector F(10) y en base al ejercio anterior asignar los valores de
		// la siguiente manera F[0]=H[3], F[3]=H[2], F[4]=H[6], F[7]=H[0], F[8]=H[],
		// F[9]=H[9]
		char F[] = new char[10];
		F[0] = H[3];
		F[3] = H[2];
		F[4] = H[6];
		F[7] = H[0];
		F[8] = H[1];
		F[9] = H[9];
		//9. Declarar un vector L(15) y asignar valores en base a lo siguiente ::L[0] =(El
		// promedio de de 3,5,7,9) L[4] =(La suma de 5,7,8,15) L[7] =(La multiplicacion
		// de 6,7,3) L[10] =(La division de 10/2)

		int L[] = new int[15];
		int s = 3 + 5 + 7 + 9;
		L[0] = s / 4;
		L[0] = 5 + 7 + 8 + 15;
		L[0] = 6 * 7 * 3;
		L[0] = 10 / 2;
		//10. Declarar un vectorN(12) y realizar las siguientes asignaciones N[0]
		// =(promedio de 3,10,9) N[4] =(La suma de 7,8,10) N[12] =(la multiplicacion de
		// ,5,7,3) N[20] =(La suma de 7,-3,8) en la ultima posicion el valor de 20/4
		int N[] = new int[12];
		int s1 = 3 + 10 + 9;
		N[0] = s / 3;
		N[4] = 7 + 8 + 10;
		//N[12] = 5 * 7 * 3;// Esta linea da un error
		//N[20] = 7 - 3 + 8;// Esta linea da un error
		N[11] = 20 / 4;
		
		//PRUEBA
		System.out.println(F[0]);
	}
	
}