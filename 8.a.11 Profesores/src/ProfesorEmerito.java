/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Santiago Uribe Burgos
 */
public class ProfesorEmerito extends Profesor {
    private int añosEmerito; 

    
    public ProfesorEmerito(String nombre, int edad, int añosConsolidados, int añosEmerito) {
        super(nombre, edad, añosConsolidados); 
        this.añosEmerito = añosEmerito;
    }

    
    public double obtenerSalarioBase() {
        
        return 925 + (añosConsolidados * 12.25) + (añosEmerito * 23.40);
    }

    
    @Override
    public String obtenerInfo() {
        return super.obtenerInfo() + ", Años Emérito: " + añosEmerito;
    }
}

