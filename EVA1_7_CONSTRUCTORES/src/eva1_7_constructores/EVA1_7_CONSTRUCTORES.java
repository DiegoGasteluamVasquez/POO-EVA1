/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_7_constructores;

/**
 *
 * @author bisonte
 */
public class EVA1_7_CONSTRUCTORES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                    //LLAMADA AL CONTRUCTOR DEFAULT
        PERSONA perso = new PERSONA();
        perso.ImprimirDatos();
        
        PERSONA perso2 = new PERSONA("Juan", "Perez Jolote", 30);
        perso2.ImprimirDatos();
                
        }
    }
    

