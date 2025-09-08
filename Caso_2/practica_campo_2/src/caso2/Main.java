package caso2;

import java.util.Scanner; //IMPORTAR LA CLASE SCANNER

public class Main {

	public static void main(String[] args) {
		 
		 Scanner obj= new Scanner(System.in);
		 
		 	System.out.print("Ingrese el nombre del estudiante: ");
		 	String nombre = obj.nextLine();

		    System.out.print("Ingrese la edad del estudiante: ");
		    int edad = obj.nextInt();
		    obj.nextLine();  

		    System.out.print("Ingrese la carrera del estudiante: ");
		    String carrera = obj.nextLine();

		    System.out.print("Ingrese el teléfono del estudiante: ");
		    String telefono = obj.nextLine();

		    System.out.print("Ingrese la dirección del estudiante: ");
		    String direccion = obj.nextLine();

		 Estudiante estudiante = new Estudiante(nombre, edad, carrera, telefono, direccion);
		 
		 estudiante.mostrarDatos();

		    obj.close();
		 
	}

}
