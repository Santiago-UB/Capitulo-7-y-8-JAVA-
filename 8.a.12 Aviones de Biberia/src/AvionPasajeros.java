/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Santiago Uribe Burgos
 */
public class AvionPasajeros extends Avion {
    private int numeroPasajeros;

    public AvionPasajeros(String nombre, String matricula, int autonomiaVuelo, int numeroPasajeros) {
        super(nombre, matricula, autonomiaVuelo);
        this.numeroPasajeros = numeroPasajeros;
    }

    public int getNumeroPasajeros() {
        return numeroPasajeros;
    }

    @Override
    public String getInformacionCompleta() {
        StringBuilder info = new StringBuilder();
        info.append("Avión de Pasajeros: ").append(nombre)
            .append(", Matrícula: ").append(matricula)
            .append(", Autonomía: ").append(autonomiaVuelo)
            .append(" km, Capacidad: ").append(numeroPasajeros)
            .append(" pasajeros.\nPasajeros:\n");

        for (Pasajero pasajero : pasajeros) {
            info.append("- ").append(pasajero.getNombre())
                .append(", DNI: ").append(pasajero.getDni())
                .append(", Edad: ").append(pasajero.getEdad()).append("\n");
        }
        return info.toString();
    }
}

