/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva1_9_cuenta_bancaria;

/**
 *
 * @author bisonte
 */
public class Cuentabancaria {
    private String titular;
    private double monto;
    
    public Cuentabancaria(String titular, double monto){
        this.titular = titular;
        this.monto = monto;
    }
    public void retirar(double monto){
        if(this.monto > monto)
        this.monto -= monto;
        else System.out.println("Monto insuficiente");
    }
    public void depositar(double monto){
        if(monto > 0)
        this.monto += monto;
        else System.out.println("No se puede hacer su deposito");
    }
    public void imprimirSaldo(){
        System.out.println("Tu saldo es: " + monto);
    }
}

