

















/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_10_tv;

/**
 *
 * @author bisonte
 */
public class EVA1_10_TV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TV tele = new TV();
        tele.consultarEstadoTV();
        tele.prenderApagar();
        tele.consultarEstadoTV();
        tele.prenderApagar();
        tele.consultarEstadoTV();
        tele.prenderApagar();
        tele.cambiarCanal(50);
        tele.consultarEstadoTV();
        
        tele.consultarEstadoTV();
        tele.prenderApagar();
        tele.cambiarVolumen(10);
        tele.consultarEstadoTV();
        
    }
    
}
