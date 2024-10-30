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

public abstract class Aeropuerto {
    protected String nombre;
    protected String ciudad;
    protected List<Avion> aviones;

    public Aeropuerto(String nombre, String ciudad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.aviones = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void agregarAvion(Avion avion) {
        aviones.add(avion);
    }

    public List<Avion> getAviones() {
        return aviones;
    }

    public abstract String getInformacionCompleta();
}

