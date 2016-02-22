/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clate22022016;

/**
 *
 * @author Estudiante
 */
public class CuentaBancaria {
    
    private String nombre;
    
    private double numCuenta;
    
    private int clave;
    
    private double saldo;
    
    
   
    public CuentaBancaria(String nombre, double numCuenta, int clave, double saldo ){
        this.nombre = nombre;
        this.numCuenta = numCuenta;
        this.clave = clave;
        this.saldo = saldo;     
    }
    
    public void consignar(double valor){
        this.saldo += valor;
    }
    public void retirar(double valor){
        this.saldo -= valor;
    }
    public void cambiarClave(int nuevaClave){
        this.clave = nuevaClave;
    }
    public double consultarSaldo(){
        return this.saldo;
    }
}

