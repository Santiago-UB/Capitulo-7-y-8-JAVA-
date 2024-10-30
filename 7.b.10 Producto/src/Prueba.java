/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Santiago Uribe Burgos
 */
public class Prueba {
    public static void main(String[] args) {
       
        Tienda tienda = new Tienda("Tienda de Electrónica", "CIF123456");

       
        Producto producto1 = new Producto("P001", 150.00);
        Producto producto2 = new Producto("P002", 200.00);
        Producto producto3 = new Producto("P003", 99.99);

        
        Factura factura1 = new Factura(1);
        factura1.añadirProducto(producto1);
        factura1.añadirProducto(producto2);

        Factura factura2 = new Factura(2);
        factura2.añadirProducto(producto3);

        
        tienda.añadirFactura(factura1);
        tienda.añadirFactura(factura2);

        
        System.out.println(tienda.consultarFactura(1)); 
        System.out.println(tienda.consultarFactura(2)); 

        
        tienda.actualizarPrecioProducto(1, "P002", 180.00);
        System.out.println("Después de actualizar el precio del producto P002:");
        System.out.println(tienda.consultarFactura(1)); 

        
        if (factura1.eliminarProducto("P001")) {
            System.out.println("Producto P001 eliminado de la factura 1.");
        }
        System.out.println("Estado de la factura 1 después de la eliminación:");
        System.out.println(tienda.consultarFactura(1)); 
    }
}

