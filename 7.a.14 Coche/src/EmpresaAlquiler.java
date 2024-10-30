/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Santiago Uribe Burgos
 */
import java.util.Scanner;

public class EmpresaAlquiler {
    private Coche[] coches;
    private int totalAlquilados;

    
    public EmpresaAlquiler() {
        coches = new Coche[5];
        totalAlquilados = 0;

        
        coches[0] = new Coche("ABC123", "Modelo1", "Marca1", 2020, 1);
        coches[1] = new Coche("DEF456", "Modelo2", "Marca2", 2019, 2);
        coches[2] = new Coche("GHI789", "Modelo3", "Marca3", 2021, 1);
        coches[3] = new Coche("JKL012", "Modelo4", "Marca4", 2022, 2);
        coches[4] = new Coche("MNO345", "Modelo5", "Marca5", 2023, 1);
    }

    
    public double alquilarVehiculo(String matricula, int dias) {
        for (Coche coche : coches) {
            if (coche.getMatricula().equals(matricula)) {
                if (coche.isAlquilado()) {
                    return 0; 
                } else {
                    coche.alquilar();
                    totalAlquilados++;
                    return coche.calcularPrecio(dias); 
                }
            }
        }
        return 0; 
    }

    
    public boolean devolverVehiculo(String matricula) {
        for (Coche coche : coches) {
            if (coche.getMatricula().equals(matricula)) {
                if (!coche.isAlquilado()) {
                    return false; 
                } else {
                    coche.devolver();
                    totalAlquilados--;
                    return true; 
                }
            }
        }
        return false; 
    }

    
    public boolean estaAlquilado(String matricula) {
        for (Coche coche : coches) {
            if (coche.getMatricula().equals(matricula)) {
                return coche.isAlquilado();
            }
        }
        return false; 
    }

    
    public int contarAlquilados() {
        return totalAlquilados;
    }

    
    public double gananciasTotales() {
        double totalGanancias = 0;
        for (Coche coche : coches) {
            if (coche.isAlquilado()) {
                totalGanancias += coche.calcularPrecio(1); 
            }
        }
        return totalGanancias;
    }

    // 
    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\n----- Menú -----");
            System.out.println("1. Alquilar vehículo");
            System.out.println("2. Devolver vehículo");
            System.out.println("3. Verificar si un vehículo está alquilado");
            System.out.println("4. Contar vehículos alquilados");
            System.out.println("5. Ganancias totales");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese matrícula: ");
                    String matriculaAlquiler = scanner.next();
                    System.out.print("Ingrese número de días: ");
                    int dias = scanner.nextInt();
                    double importe = alquilarVehiculo(matriculaAlquiler, dias);
                    if (importe == 0) {
                        System.out.println("No se pudo alquilar el vehículo.");
                    } else {
                        System.out.println("Importe del alquiler: " + importe + " euros.");
                    }
                    break;
                case 2:
                    System.out.print("Ingrese matrícula: ");
                    String matriculaDevolucion = scanner.next();
                    boolean devolucionExitosa = devolverVehiculo(matriculaDevolucion);
                    if (!devolucionExitosa) {
                        System.out.println("Error: el vehículo no está alquilado.");
                    } else {
                        System.out.println("Vehículo devuelto exitosamente.");
                    }
                    break;
                case 3:
                    System.out.print("Ingrese matrícula: ");
                    String matriculaConsulta = scanner.next();
                    boolean alquilado = estaAlquilado(matriculaConsulta);
                    System.out.println("El vehículo está " + (alquilado ? "alquilado." : "disponible."));
                    break;
                case 4:
                    System.out.println("Número de vehículos alquilados: " + contarAlquilados());
                    break;
                case 5:
                    System.out.println("Ganancias totales: " + gananciasTotales() + " euros.");
                    break;
                case 6:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 6);
        scanner.close();
    }
}

