package caso3;

public class CuentaBancaria {

	private String titular;
    private double saldo;

    
    public CuentaBancaria (String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    
    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("Depósito exitoso. Nuevo saldo: " + saldo);
        } else {
            System.out.println("El monto a depositar debe ser positivo.");
        }
    }

    
    public void retirar(double monto) {
        if (monto <= 0) {
            System.out.println("El monto a retirar debe ser positivo.");
        } else if (monto > saldo) {
            System.out.println("Fondos insuficientes. Saldo actual: " + saldo);
        } else {
            saldo -= monto;
            System.out.println("Retiro exitoso. Nuevo saldo: " + saldo);
        }
    }

    
    public double getSaldo() {
        return saldo;
    }

    
    public String getTitular() {
        return titular;
    }
	
}
