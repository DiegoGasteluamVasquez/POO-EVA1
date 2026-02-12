/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva1_7_constructores;

/**
 *
 * @author bisonte
 */
public class PERSONA{
    private String nombre;
    private String apellido;
    private int edad;
   //CONSTRUCTORES 
    public PERSONA(){//CONSTRUCTORES DEFAULT
        //INICIALIZAR
        nombre = "----";
        apellido = "----";
        edad = -1;
        System.out.println("LLAMADA AL CONSTRUCTOR DEFAULT");
    }
    //FIRMA
    public PERSONA(String nombre, String apellido, int edad){
     //INICIALIZAR
     //this --> operador para acceder al contenido del obejeto actual
     //permite visualizar todo lo que eata definido en la clase
     this.nombre = nombre;
     this.apellido = apellido;
     this.edad = edad;
     
    }
    //COMPORTAMIENTO
    public String getNombre(){//CONSTRUCTORES DEFAULT
        //INICIALIZAR
        return nombre;
    }
    public void setNombre(String valor){
        nombre = valor;
    }
    public String getApellido(){
        return apellido;
    }
    public void setApellido(String valor){
        apellido = valor;
    }
    public int getEdad(){
        return edad;
    }
    public void setEdad(int valor){
        edad = valor;
    }
    public void ImprimirDatos(){
        System.out.println("------- DATOS DE LA PERSONA -------");
        System.out.println("NOMBRE: " + nombre);
        System.out.println("APELLIDO: " + apellido);
        System.out.println("EDAD: " + edad);
        
    } 
}
