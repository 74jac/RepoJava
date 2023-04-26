/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author JoséAgustín
 */
public class CuentaBancaria {
   
    public int numeroCuenta;
    public long dniCliente;
    public double saldo;

    public CuentaBancaria(int numeroCuenta, long dniCliente, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.dniCliente = dniCliente;
        this.saldo = saldo;
    }
    
    public CuentaBancaria (){
        
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(long dniCliente) {
        this.dniCliente = dniCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
   
}
