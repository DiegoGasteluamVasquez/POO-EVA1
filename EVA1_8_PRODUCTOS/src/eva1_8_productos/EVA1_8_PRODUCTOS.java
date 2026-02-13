/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_8_productos;

/**
 *
 * @author bisonte
 */
public class EVA1_8_PRODUCTOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Productos producto = new Productos("Tomates", "Heinz", "Kg", 25, 100);
        producto.imprimirDatos();
        double monto = producto.calcularMonto();
        System.out.println("Monto: " + monto);
    }
    
}
