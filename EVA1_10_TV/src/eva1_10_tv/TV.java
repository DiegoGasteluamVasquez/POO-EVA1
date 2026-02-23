/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva1_10_tv;

/**
 *
 * @author bisonte
 */
public class TV {
    private boolean estadoTV ;
    private int canal;
    private int volumen;
    
    
    public TV(){
        estadoTV = false;
    }
    
    public void prenderApagar(){
        /*if(estadoTV == false)
            estadoTV = true;
        else
            estadoTV = false;}*/
        //variable booleana
        estadoTV = !estadoTV;
    }
    
    public void consultarEstadoTV(){
        if(estadoTV == true)
            System.out.println("ENCENDIDA");
        else
            System.out.println("APAGADA");
            System.out.println("Canal: " + canal);
            System.out.println("Volumen: " + volumen);
    }
    
    public void aumentarCanal(){
        canal++;
    }
    
    public void decrementarCanal(){
        canal--;
    }
    
    public void cambiarCanal(int canal){
        this.canal = canal;
    }
    
    public void aumentarVolumen(){
        volumen++;
    }
    
    public void decrementarVolumen(){
        volumen--;
    }
    
    public void cambiarVolumen(int volumen){
        this.volumen  = volumen;
    }
}
