package caso1;
import java.util.Scanner; //se importa la biblioteca;

public class UsuarioSimple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creo el objeto scanner
		Scanner sc = new Scanner(System.in); 
		
		//Pido los datos y antes de eso printeo un texto
		System.out.println("Ingrese su nombre: ");
		String nombre = sc.nextLine();
		
		System.out.println("Ingrese su edad: ");
		int edad = sc.nextInt();
		
		System.out.println("Ingrese su sexo (F/M): ");
		String sexo = sc.next();
		
		sc.close();
		
		//Muestro los datos capturados 
		System.out.println("***********************");
		System.out.println("Datos generados");
		System.out.println("***********************");
		System.out.println("Nombre: "+ nombre);
		System.out.println("Edad: "+ edad);
		System.out.println("Sexo: "+ sexo);

	}

}
