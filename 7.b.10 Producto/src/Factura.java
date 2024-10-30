/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Santiago Uribe Burgos
 */
import java.util.ArrayList;

public class Factura {
    
    private final int numero;
    private final ArrayList<Producto> productos;

    
    public Factura(int numero) {
        this.numero = numero;
        this.productos = new ArrayList<>();
    }

    
    public void añadirProducto(Producto producto) {
        productos.add(producto);
    }

    
    public int getNumero() {
        return numero;
    }

    
    public ArrayList<Producto> getProductos() {
        return productos;
    }

    
    public boolean eliminarProducto(String codigo) {
        for (Producto producto : productos) {
            if (producto.getCodigo().equals(codigo)) {
                productos.remove(producto);
                return true; 
            }
        }
        return false; 
    }

    @Override
    public String toString() {
        StringBuilder detalle = new StringBuilder("Factura #" + numero + ":\n");
        for (Producto producto : productos) {
            detalle.append(producto.toString()).append("\n");
        }
        return detalle.toString();
    }
}
