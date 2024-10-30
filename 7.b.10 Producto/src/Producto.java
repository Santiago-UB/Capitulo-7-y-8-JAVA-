/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Santiago Uribe Burgos
 */
public class Producto {
    
    private String codigo;
    private double precio;

    
    public Producto(String codigo, double precio) {
        this.codigo = codigo;
        this.precio = precio;
    }

   
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto [Código: " + codigo + ", Precio: " + precio + "]";
    }
}
