/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Santiago Uribe Burgos
 */
import java.util.ArrayList;
import java.util.List;

public class Almacen {
    private List<Producto> productos;

    public Almacen() {
        productos = new ArrayList<>();
    }

    public void anadirProducto(Producto producto) {
        productos.add(producto);
    }

    public void listarProductos() {
        for (Producto p : productos) {
            System.out.println("Nombre: " + p.getNombre() + ", Precio: " + p.calcularPrecio() + " euros");
        }
    }

    public void listarProductosEnPeligro() {
        for (Producto p : productos) {
            if (p instanceof CarneFresca) {
                CarneFresca carneFresca = (CarneFresca) p;
                if (carneFresca.getDiasCaducidad() < 10) {
                    System.out.println("Nombre: " + carneFresca.getNombre() + ", Días de Caducidad: " + carneFresca.getDiasCaducidad());
                }
            }
        }
    }

    public double calcularPrecioMedio() {
        double total = 0;
        for (Producto p : productos) {
            total += p.calcularPrecio();
        }
        return total / productos.size();
    }

    public void eliminarBandejas() {
        productos.removeIf(p -> p instanceof CarneCongeladaPiezaEntera && ((CarneCongeladaPiezaEntera) p).isEnBandeja());
    }

    public List<Producto> getProductos() {
        return productos;
    }
}

