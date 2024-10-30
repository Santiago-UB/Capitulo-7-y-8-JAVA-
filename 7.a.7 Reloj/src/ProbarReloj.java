/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Santiago Uribe Burgos
 */
public class ProbarReloj {
    public static void main(String[] args) {
        
        Reloj reloj = new Reloj(10, 30, 15);
        System.out.println("Hora inicial: " + reloj.mostrarHora());

        
        reloj.setHora(12);
        reloj.setMinuto(45);
        reloj.setSegundo(50);
        System.out.println("Hora modificada: " + reloj.mostrarHora());

        
        reloj.adelantarReloj(125);
        System.out.println("Después de adelantar 125 segundos: " + reloj.mostrarHora());

        
        reloj.atrasarReloj(200);
        System.out.println("Después de atrasar 200 segundos: " + reloj.mostrarHora());
    }
}

