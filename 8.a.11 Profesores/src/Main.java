/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Santiago Uribe Burgos
 */
public class Main {
    public static void main(String[] args) {
        
        Profesor profesor = new Profesor("Maria Guerrero", 45, 15);
        System.out.println(profesor.obtenerInfo());

       
        ProfesorEmerito profesorEmerito = new ProfesorEmerito("Beatriz Pinzon", 70, 30, 10);
        System.out.println(profesorEmerito.obtenerInfo());
        
       
        System.out.println("Salario Base del Profesor Emérito: " + profesorEmerito.obtenerSalarioBase());
    }
}

