/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva1_6_formato_apa;

/**
 *
 * @author bisonte
 */
public class Libros {
    private String autor;
    private String libro;
    private int year;
    private String ciudad;
    private String editorial;
    private int paginas;
    //COMPORTAMIENTO
    public String getAutor(){
        return autor;
    }
    public void setAutor(String valor){
        autor = valor;
    }
    public String getLibro(){
        return libro;
    }
    public void setLibro(String valor){
        libro = valor;
    }
    public int getYear(){
        return year;
    }
    public void setYear(int valor){
        year = valor;
    }
    public String getCiudad(){
        return ciudad;
    }
    public void setCiudad(String valor){
        ciudad = valor;
    }
    public String getEditorial(){
        return editorial;
    }
    public void setEditorial(String valor){
        editorial = valor;
    }
    public double getPaginas(){
        return paginas;
    }
    public void setPaginas(int valor){
        paginas = valor;
    }
    public void ImprimirDatos(){
        System.out.println("------- DATOS DEL LIBRO -------");
        System.out.println("Autor: " + autor);
        System.out.println("Libro: " + libro);
        System.out.println("Año: " + year);
        System.out.println("Ciudad: " + ciudad);
        System.out.println("Editorial: " + editorial);
        System.out.println("Paginas: " + paginas);
    }
}
