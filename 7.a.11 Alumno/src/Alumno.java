/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Santiago Uribe Burgos
 */
public class Alumno {
    
    private String nombre;
    private final double[] notas;

    
    public Alumno(String nombre) {
        this.nombre = nombre;
        this.notas = new double[3]; 
    }

    
    public String getNombre() {
        return nombre;
    }

    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    public boolean ponerNota(int evaluacion, double nota) {
        if (evaluacion >= 1 && evaluacion <= 3 && nota >= 1 && nota <= 10) {
            notas[evaluacion - 1] = nota; 
            return true;
        }
        return false; 
    }

    
    public boolean borrarNota(int evaluacion) {
        if (evaluacion >= 1 && evaluacion <= 3) {
            notas[evaluacion - 1] = 0; 
            return true;
        }
        return false; 
    }

    
    public int numeroNotas() {
        int contador = 0;
        for (double nota : notas) {
            if (nota > 0) {
                contador++;
            }
        }
        return contador;
    }

    
    public double notaMaxima() {
        double maxNota = -1; 
        for (double nota : notas) {
            if (nota > maxNota) {
                maxNota = nota;
            }
        }
        return maxNota;
    }

    
    public boolean tieneNota(int evaluacion) {
        if (evaluacion >= 1 && evaluacion <= 3) {
            return notas[evaluacion - 1] > 0;
        }
        return false; 
    }

    
    public double getNota(int evaluacion) {
        if (evaluacion >= 1 && evaluacion <= 3) {
            return notas[evaluacion - 1]; 
        }
        return -1;
    }
}



