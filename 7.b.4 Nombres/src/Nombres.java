/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Santiago Uribe Burgos
 */
public class Nombres {
    
    private final String[] listaNombres;
    private int numNombresActuales;

    
    public Nombres(int maxNombres) {
        listaNombres = new String[maxNombres];
        numNombresActuales = 0;
    }

    
    public boolean anadir(String nombre) {
        if (estaLlena() || contiene(nombre)) {
            return false; 
        }
        listaNombres[numNombresActuales] = nombre; 
        numNombresActuales++;
        return true;
    }

    
    public boolean eliminar(String nombre) {
        for (int i = 0; i < numNombresActuales; i++) {
            if (listaNombres[i].equals(nombre)) {
                
                for (int j = i; j < numNombresActuales - 1; j++) {
                    listaNombres[j] = listaNombres[j + 1];
                }
                listaNombres[numNombresActuales - 1] = null; 
                numNombresActuales--;
                return true;
            }
        }
        return false; 
    }

    
    public void vaciar() {
        for (int i = 0; i < numNombresActuales; i++) {
            listaNombres[i] = null; 
        }
        numNombresActuales = 0; 
    }

    
    public String mostrar(int posicion) {
        if (posicion >= 0 && posicion < numNombresActuales) {
            return listaNombres[posicion];
        }
        return null; 
    }

    
    public int numNombres() {
        return numNombresActuales;
    }

    
    public int maxNombres() {
        return listaNombres.length;
    }

    
    public boolean estaLlena() {
        return numNombresActuales == listaNombres.length;
    }

    
    private boolean contiene(String nombre) {
        for (int i = 0; i < numNombresActuales; i++) {
            if (listaNombres[i].equals(nombre)) {
                return true;
            }
        }
        return false;
    }
}

