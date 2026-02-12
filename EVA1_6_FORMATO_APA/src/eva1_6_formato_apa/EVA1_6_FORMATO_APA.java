/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_6_formato_apa;

/**
 *
 * @author bisonte
 */
public class EVA1_6_FORMATO_APA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Libros[] Libreria = new Libros[3];
        for (int i = 0; i < Libreria.length; i++){
            Libreria[i] = new Libros(); 
            Libreria[i].setAutor("Anand Dílvar");
            Libreria[i].setLibro("El esclavo");
            Libreria[i].setYear(2013);
            Libreria[i].setCiudad("México");
            Libreria[i].setEditorial("Ediciones Martínez Roca");
            Libreria[i].setPaginas(156);
            Libreria[i].ImprimirDatos();
        }
    }
    
}
