/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Santiago Uribe Burgos
 */
import java.util.ArrayList;

public class Tienda {
   
    private String nombre;
    private String cif;
    private ArrayList<Factura> facturas;

    
    public Tienda(String nombre, String cif) {
        this.nombre = nombre;
        this.cif = cif;
        this.facturas = new ArrayList<>();
    }

    
    public void añadirFactura(Factura factura) {
        facturas.add(factura);
    }

    
    public Factura consultarFactura(int numero) {
        for (Factura factura : facturas) {
            if (factura.getNumero() == numero) {
                return factura; 
            }
        }
        return null; 
    }

    
    public boolean actualizarPrecioProducto(int numeroFactura, String codigoProducto, double nuevoPrecio) {
        Factura factura = consultarFactura(numeroFactura);
        if (factura != null) {
            for (Producto producto : factura.getProductos()) {
                if (producto.getCodigo().equals(codigoProducto)) {
                    producto.setPrecio(nuevoPrecio);
                    return true; 
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Tienda [Nombre: " + nombre + ", CIF: " + cif + "]";
    }
}

