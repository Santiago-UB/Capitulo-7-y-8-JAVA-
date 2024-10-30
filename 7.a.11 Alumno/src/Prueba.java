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
        
        Alumno[] alumnos = new Alumno[3];
        alumnos[0] = new Alumno("Juan");
        alumnos[1] = new Alumno("María");
        alumnos[2] = new Alumno("Pedro");

        
        alumnos[0].ponerNota(1, 8.5);
        alumnos[0].ponerNota(2, 9.0);
        alumnos[1].ponerNota(1, 7.0);
        alumnos[2].ponerNota(3, 6.5);

       
        System.out.println("Nombre: " + alumnos[0].getNombre());
        System.out.println("Número de notas de Juan: " + alumnos[0].numeroNotas());
        System.out.println("Nota máxima de Juan: " + alumnos[0].notaMaxima());

        
        alumnos[0].borrarNota(2);
        System.out.println("Nota borrada en evaluación 2 de Juan.");
        System.out.println("Número de notas de Juan: " + alumnos[0].numeroNotas());

        
        System.out.println("¿Juan tiene nota en evaluación 1? " + alumnos[0].tieneNota(1));
        System.out.println("¿Juan tiene nota en evaluación 2? " + alumnos[0].tieneNota(2));

        
        System.out.println("Nota de Juan en evaluación 1: " + alumnos[0].getNota(1));
        System.out.println("Nota de Juan en evaluación 2: " + alumnos[0].getNota(2));
        
        
        System.out.println("\nNombre: " + alumnos[1].getNombre());
        System.out.println("Nota máxima de María: " + alumnos[1].notaMaxima());
        System.out.println("\nNombre: " + alumnos[2].getNombre());
        System.out.println("Nota máxima de Pedro: " + alumnos[2].notaMaxima());
    }
}

