/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Santiago Uribe Burgos
 */
public class PruebaNombres {
    public static void main(String[] args) {
        
        Nombres lista = new Nombres(5);

        
        if (lista.anadir("Juan")) {
            System.out.println("Nombre 'Juan' añadido correctamente.");
        } else {
            System.out.println("No se pudo añadir 'Juan' (lista llena o nombre repetido).");
        }

        if (lista.anadir("Ana")) {
            System.out.println("Nombre 'Ana' añadido correctamente.");
        } else {
            System.out.println("No se pudo añadir 'Ana' (lista llena o nombre repetido).");
        }

        if (lista.anadir("Luis")) {
            System.out.println("Nombre 'Luis' añadido correctamente.");
        } else {
            System.out.println("No se pudo añadir 'Luis' (lista llena o nombre repetido).");
        }

        if (!lista.anadir("Ana")) {  
            System.out.println("No se pudo añadir 'Ana' (nombre repetido).");
        }

        if (lista.anadir("Pedro")) {
            System.out.println("Nombre 'Pedro' añadido correctamente.");
        } else {
            System.out.println("No se pudo añadir 'Pedro' (lista llena o nombre repetido).");
        }

        if (lista.anadir("Maria")) {
            System.out.println("Nombre 'Maria' añadido correctamente.");
        } else {
            System.out.println("No se pudo añadir 'Maria' (lista llena o nombre repetido).");
        }

        if (!lista.anadir("Carlos")) {  
            System.out.println("No se pudo añadir 'Carlos' (lista llena).");
        }

      
        System.out.println("\nLista de nombres:");
        for (int i = 0; i < lista.numNombres(); i++) {
            System.out.println("Nombre en posición " + i + ": " + lista.mostrar(i));
        }

        
        if (lista.eliminar("Ana")) {
            System.out.println("\nNombre 'Ana' eliminado correctamente.");
        } else {
            System.out.println("\nNo se pudo eliminar 'Ana' (nombre no encontrado).");
        }

        if (!lista.eliminar("Rosa")) {  
            System.out.println("No se pudo eliminar 'Rosa' (nombre no encontrado).");
        }

        
        System.out.println("\nLista de nombres después de eliminaciones:");
        for (int i = 0; i < lista.numNombres(); i++) {
            System.out.println("Nombre en posición " + i + ": " + lista.mostrar(i));
        }

        
        if (lista.estaLlena()) {
            System.out.println("\nLa lista está llena.");
        } else {
            System.out.println("\nLa lista no está llena.");
        }

       
        lista.vaciar();
        System.out.println("\nLista vaciada.");
        System.out.println("Número de nombres tras vaciar: " + lista.numNombres());
    }
}
