package com.edu.ec;

public class CuentaBancaria {
	private static String nombreBanco = "Banco del Ecuador" ;
	private static int totalCuentasCreadas = 0 ;
	
	private final String numeroCuenta; 
	private String titular;
	private double saldo;
	
	public CuentaBancaria(String numeroCuenta, String titular, double saldoInicial) {
		this.numeroCuenta = numeroCuenta;
		this.titular = titular ;
		
	 if(saldoInicial < 0) {
		 this.saldo = 0.0 ;
	 } else {
		 this.saldo = saldoInicial;
	
	totalCuentasCreadas++ ; }
	}
	public void depositar(double monto) {
		if (monto > 0) {
			double umbral = 300.0 ;
			double bono = 0.0 ;
		
		    if (monto >= umbral) {
	             bono = 25.0; 
	             System.out.println("Usted recibe un bono de 15.0$!");
	         }
		    this.saldo += monto + bono;
		    System.out.println("Deposito realizado. Su saldo actual es de: $" + this.saldo);
		} else {
	        System.out.println("Deposito no valido.");
	    }
	}
public boolean retirar(double monto) {
    if (monto <= 0) {
        System.out.println("Retiro inválido.");
        return false;
    }
    double comision = 1.0; 
    double totalADescuentar = monto + comision;
    
    if (this.saldo >= totalADescuentar) {
        this.saldo -= totalADescuentar;
        System.out.println("Retiro hecho. Se cobró una comisión de $" + comision);
        return true; 
    } else {
        System.out.println("Retiro rechazado. Saldo insuficientes.");
        return false;
    }
}
public static int getTotalCuentas() {
    return totalCuentasCreadas;
}

public String getNumeroCuenta() {
    return numeroCuenta;
}

public String getTitular() {
    return titular;
}

public void setTitular(String titular) {
    if (titular != null && !titular.trim().isEmpty()) {
        this.titular = titular;
    }
}

public double getSaldo() {
    return saldo;
}
}
