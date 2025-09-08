package caso3;

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Ingrese el nombre del titular: ");
        String titular = sc.nextLine();

        System.out.print("Ingrese el saldo inicial: ");
        double saldoInicial = sc.nextDouble();

        CuentaBancaria cuenta = new CuentaBancaria(titular, saldoInicial);

        int opcion;
        do {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Retirar");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Saldo actual: " + cuenta.getSaldo());
                    break;
                case 2:
                    System.out.print("Monto a depositar: ");
                    double montoDeposito = sc.nextDouble();
                    cuenta.depositar(montoDeposito);
                    break;
                case 3:
                    System.out.print("Monto a retirar: ");
                    double montoRetiro = sc.nextDouble();
                    cuenta.retirar(montoRetiro);
                    break;
                case 4:
                    System.out.println("Gracias por usar el sistema.");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 4);

        sc.close();
    }

}
