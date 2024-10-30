/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Santiago Uribe Burgos
 */
public class Profesor {
    protected String nombre;             
    protected int edad;                  
    protected int añosConsolidados;      

    
    public Profesor(String nombre, int edad, int añosConsolidados) {
        this.nombre = nombre;
        this.edad = edad;
        this.añosConsolidados = añosConsolidados;
    }

    
    public String obtenerInfo() {
        return "Nombre: " + nombre + ", Edad: " + edad + ", Años Consolidados: " + añosConsolidados;
    }
}

