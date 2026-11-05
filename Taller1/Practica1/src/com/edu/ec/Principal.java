package com.edu.ec;

public class Principal {
    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria("001", "Juan Perez", 100.0);
        CuentaBancaria cuenta2 = new CuentaBancaria("002", "Maria Lopez", 600.0);
        
        System.out.println("--- Transacciones Cuenta 1 ---");
        cuenta1.depositar(50.0);
        cuenta1.retirar(200.0);   
        
        System.out.println("--- Transacciones Cuenta 2 ---");
        cuenta2.depositar(550.0); 
        cuenta2.retirar(100.0);  
        
        System.out.println("--- Estado Final de las Cuentas ---");
        System.out.println("Titular: " + cuenta1.getTitular() + " | Saldo actual: $" + cuenta1.getSaldo());
        System.out.println("Titular: " + cuenta2.getTitular() + " | Saldo actual: $" + cuenta2.getSaldo());
        
        System.out.println("--- Reporte de Control ---");
        System.out.println("Total de cuentas creadas en el sistema: " + CuentaBancaria.getTotalCuentas());
    }
}
