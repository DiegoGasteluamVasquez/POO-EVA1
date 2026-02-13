-/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva1_8_productos;

/**
 *
 * @author bisonte
 */
public class Productos {
    private String nombre;
    private String marca;
    private double precio;
    private double cantidad;
    private String unidad;
    
    public Productos(){
        this.nombre = "----";
        this.marca = "----";
        this.unidad = "----";
        this.precio = 0;
        this.cantidad = 0;
    }
    public Productos(String nombre, String marca, String unidad, double precio, double cantidad){
       this.nombre = nombre;
        this.marca = marca;
        this.unidad = unidad;
        this.precio = precio;
        this.cantidad = cantidad; 
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public double getPrecio(){
        return precio;
    }
    public void setPrecio(double precio){
        this.precio = precio;
    }
    public double getCantidad(){
        return cantidad;
    }
    public void setCantidad(double cantidad){
        this.cantidad = cantidad;
    }
    public String getUnidad(){
        return unidad;
    }
    public void setUnidad(String unidad){
        this.unidad = unidad;
    }
    public void imprimirDatos(){
        System.out.println("------- PRODUCTO: -------");
        System.out.println("Producto: " + nombre);
        System.out.println("Marca: " + marca);
        System.out.println("Unidad: " + unidad);
        System.out.println("Precio: " + precio);
        System.out.println("Cantidad: " + cantidad);
   
    }
    public double calcularMonto(){
        return precio * cantidad;
    }
}
