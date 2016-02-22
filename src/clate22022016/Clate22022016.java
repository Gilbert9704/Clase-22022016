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
public class Clate22022016 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        CuentaBancaria c1 = new CuentaBancaria("Jose", 123456789, 1234, 2000000);
        c1.consignar(1500000000);
        double saldo = c1.consultarSaldo();
        System.out.println("Su Cuenta es" + saldo );
    }
    
}
