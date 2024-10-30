/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Santiago Uribe Burgos
 */
public class Prueba {
    public static void main(String[] args) {
        GrupoPersonas grupo = new GrupoPersonas();

        
        grupo.añadirPersona(new Persona('c', 3000, false)); 
        grupo.añadirPersona(new Persona('s', 1500, false)); 
        grupo.añadirPersona(new Persona('s', 2000, true));  
        grupo.añadirPersona(new Persona('c', 2500, true));  
        grupo.añadirPersona(new Persona('s', 4000, false)); 
        grupo.añadirPersona(new Persona('v', 2000, true));  
        grupo.añadirPersona(new Persona('c', 5000, false)); 
        grupo.añadirPersona(new Persona('s', 3000, true));  

        
        int totalMujeres = grupo.contarMujeres();
        int totalHombresCasados = grupo.contarHombresCasados();
        boolean sueldoMedioMayor = grupo.sueldoMedioHombresSolterosMayor();

        
        System.out.println("Número de mujeres: " + totalMujeres);
        System.out.println("Número de hombres casados: " + totalHombresCasados);
        System.out.println("¿El sueldo medio de hombres solteros es mayor que el de hombres casados? " + (sueldoMedioMayor ? "Sí" : "No"));
    }
}

