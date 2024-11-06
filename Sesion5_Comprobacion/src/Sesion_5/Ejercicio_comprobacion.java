package Sesion_5;

import java.util.Scanner;

public class Ejercicio_comprobacion {

	
	public static void main(String[]args) {
		
		String[] asignatura = new String[5];
		double [] notas = new double[5];
		double promedio = 0;
		Scanner input = new Scanner(System.in);

		 for(int i = 0; i < asignatura.length; i++) {
			 
			 System.out.println("Ingrese el nombre de la asignatura");
			 asignatura[i] = input.nextLine();
			 System.out.println("Ingrese el promedio de la  asignatura "+asignatura[i]);
			 notas[i] = input.nextDouble();
			 input.nextLine();
		 }

		 System.out.println("Sus notas son las siguientes");
		 for (int i = 0; i < asignatura.length; i++) {
			 
			 System.out.println(asignatura[i]+" = "+notas[i]);
			 promedio += notas[i];
		}
		 double promedioFinal = promedio / asignatura.length;
		 System.out.println("Su promedio general es "+(promedioFinal));
	}
}
