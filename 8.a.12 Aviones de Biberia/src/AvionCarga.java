/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Santiago Uribe Burgos
 */
public class AvionCarga extends Avion {
    private int cargaMaxima; 

    public AvionCarga(String nombre, String matricula, int autonomiaVuelo, int cargaMaxima) {
        super(nombre, matricula, autonomiaVuelo);
        this.cargaMaxima = cargaMaxima;
    }

    public int getCargaMaxima() {
        return cargaMaxima;
    }

    @Override
    public String getInformacionCompleta() {
        return "Avión de Carga: " + nombre + ", Matrícula: " + matricula +
               ", Autonomía: " + autonomiaVuelo + " km, Carga máxima: " + cargaMaxima + " Kg.";
    }
}

