/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Santiago Uribe Burgos
 */
import java.util.Scanner;

public class Biberia {
    private static Aeropuerto[] aeropuertos = new Aeropuerto[3];
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        inicializarAeropuertos();

        int opcion;
        do {
            System.out.println("\n--- Menú Biberia ---");
            System.out.println("1. Mostrar información de los aeropuertos");
            System.out.println("2. Mostrar información de aviones en un aeropuerto");
            System.out.println("3. Agregar pasajero a un avión");
            System.out.println("4. Consultar información de un pasajero");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    mostrarInformacionAeropuertos();
                    break;
                case 2:
                    mostrarAvionesEnAeropuerto();
                    break;
                case 3:
                    agregarPasajeroAAvion();
                    break;
                case 4:
                    consultarInformacionPasajero();
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 0);
    }

    private static void inicializarAeropuertos() {
        aeropuertos[0] = new AeropuertoComercial("Aeropuerto Internacional", "Ciudad A", 5);
        aeropuertos[1] = new AeropuertoComercial("Aeropuerto Regional", "Ciudad B", 3);
        aeropuertos[2] = new AeropuertoMilitar("Aeropuerto Militar Biberia", "Ciudad C", "Clave Secreta");

        
        aeropuertos[0].agregarAvion(new AvionPasajeros("Avión A", "ABC123", 5000, 180));
        aeropuertos[0].agregarAvion(new AvionCarga("Carga B", "CDE456", 6000, 20000));
        aeropuertos[1].agregarAvion(new Avioneta("Avioneta A", "FGH789", 1500, 4));
        aeropuertos[2].agregarAvion(new AvionPasajeros("Avión Militar", "JKL012", 8000, 120));
    }

    private static void mostrarInformacionAeropuertos() {
        for (Aeropuerto aeropuerto : aeropuertos) {
            System.out.println(aeropuerto.getInformacionCompleta());
        }
    }

    private static void mostrarAvionesEnAeropuerto() {
        System.out.print("Nombre del aeropuerto: ");
        String nombreAeropuerto = scanner.nextLine();
        for (Aeropuerto aeropuerto : aeropuertos) {
            if (aeropuerto.getNombre().equalsIgnoreCase(nombreAeropuerto)) {
                for (Avion avion : aeropuerto.getAviones()) {
                    System.out.println(avion.getInformacionCompleta());
                }
                return;
            }
        }
        System.out.println("Aeropuerto no encontrado.");
    }

    private static void agregarPasajeroAAvion() {
        System.out.print("Nombre del avión: ");
        String nombreAvion = scanner.nextLine();
        for (Aeropuerto aeropuerto : aeropuertos) {
            for (Avion avion : aeropuerto.getAviones()) {
                if (avion.getNombre().equalsIgnoreCase(nombreAvion)) {
                    System.out.print("Nombre del pasajero: ");
                    String nombrePasajero = scanner.nextLine();
                    System.out.print("DNI del pasajero: ");
                    String dniPasajero = scanner.nextLine();
                    System.out.print("Edad del pasajero: ");
                    int edadPasajero = scanner.nextInt();
                    scanner.nextLine(); // Limpiar buffer
                    avion.agregarPasajero(new Pasajero(nombrePasajero, dniPasajero, edadPasajero));
                    System.out.println("Pasajero agregado.");
                    return;
                }
            }
        }
        System.out.println("Avión no encontrado.");
    }

    private static void consultarInformacionPasajero() {
        System.out.print("Nombre del pasajero: ");
        String nombrePasajero = scanner.nextLine();
        for (Aeropuerto aeropuerto : aeropuertos) {
            for (Avion avion : aeropuerto.getAviones()) {
                for (Pasajero pasajero : avion.getPasajeros()) {
                    if (pasajero.getNombre().equalsIgnoreCase(nombrePasajero)) {
                        System.out.println("Pasajero: " + pasajero.getNombre() + ", DNI: " + pasajero.getDni() + ", Edad: " + pasajero.getEdad());
                        System.out.println("Asignado a avión: " + avion.getNombre() + " en el aeropuerto: " + aeropuerto.getNombre());
                        return;
                    }
                }
            }
        }
        System.out.println("Pasajero no encontrado.");
    }
}

