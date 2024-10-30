/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Santiago Uribe Burgos
 */
public class AeropuertoMilitar extends Aeropuerto {
    private String nombreEnClave;

    public AeropuertoMilitar(String nombre, String ciudad, String nombreEnClave) {
        super(nombre, ciudad);
        this.nombreEnClave = nombreEnClave;
    }

    public String getNombreEnClave() {
        return nombreEnClave;
    }

    @Override
    public String getInformacionCompleta() {
        return "Aeropuerto Militar: " + nombre + ", Ciudad: " + ciudad + ", Nombre en clave: " + nombreEnClave;
    }
}

