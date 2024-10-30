/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Santiago Uribe Burgos
 */
public class AeropuertoComercial extends Aeropuerto {
    private int numeroTerminales;

    public AeropuertoComercial(String nombre, String ciudad, int numeroTerminales) {
        super(nombre, ciudad);
        this.numeroTerminales = numeroTerminales;
    }

    public int getNumeroTerminales() {
        return numeroTerminales;
    }

    @Override
    public String getInformacionCompleta() {
        return "Aeropuerto Comercial: " + nombre + ", Ciudad: " + ciudad + ", Número de terminales: " + numeroTerminales;
    }
}

