/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Santiago Uribe Burgos
 */
public class Coche {
    private final String matricula;
    private final String modelo;
    private final String marca;
    private final int anioMatriculacion;
    private final int categoria; 
    private boolean estado; 
    private double precio;

    
    public Coche(String matricula, String modelo, String marca, int anioMatriculacion, int categoria) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.marca = marca;
        this.anioMatriculacion = anioMatriculacion;
        this.categoria = categoria;
        this.estado = false; 
    }

    
    public String getMatricula() {
        return matricula;
    }

    public int getCategoria() {
        return categoria;
    }

    public boolean isAlquilado() {
        return estado;
    }

    public void alquilar() {
        estado = true;
    }

    public void devolver() {
        estado = false;
    }

    public double calcularPrecio(int dias) {
        if (categoria == 1) {
            return (dias <= 2) ? dias * 40 : dias * 30;
        } else if (categoria == 2) {
            return (dias <= 2) ? dias * 60 : dias * 45;
        }
        return 0;
    }
}

