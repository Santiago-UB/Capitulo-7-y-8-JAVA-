/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Santiago Uribe Burgos
 */
import java.util.HashMap;
import java.util.Map;

public class CajaRegistrador implements ICajaRegistradora {
    private String nombre;
    private Map<Double, Integer> monedas;

    public CajaRegistrador(String nombre) {
        this.nombre = nombre;
        this.monedas = new HashMap<>();
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public int getNumTipoMonedas() {
        return monedas.size();
    }

    @Override
    public int getUnidadesTipoMoneda(double tipo) {
        return monedas.getOrDefault(tipo, -1);
    }

    @Override
    public boolean meterMonedas(double tipo, int unidades) {
        if (monedaValida(tipo) && unidades > 0) {
            monedas.put(tipo, monedas.getOrDefault(tipo, 0) + unidades);
            return true;
        }
        return false;
    }

    @Override
    public boolean monedaValida(double tipo) {
        return tipo == 0.5 || tipo == 1.0 || tipo == 2.0 || tipo == 5.0 || tipo == 10.0;
    }

    @Override
    public boolean sacarMonedas(double tipo, int unidades) {
        if (monedaValida(tipo) && monedas.containsKey(tipo) && monedas.get(tipo) >= unidades) {
            monedas.put(tipo, monedas.get(tipo) - unidades);
            return true;
        }
        return false;
    }

    @Override
    public void vaciarCajaRegistradora() {
        monedas.clear();
    }

    @Override
    public double[] getTiposDeMonedas() {
        return monedas.keySet().stream().mapToDouble(Double::doubleValue).toArray();
    }

    @Override
    public double getSaldo() {
        double saldo = 0.0;
        for (Map.Entry<Double, Integer> entry : monedas.entrySet()) {
            saldo += entry.getKey() * entry.getValue();
        }
        return saldo;
    }
}

