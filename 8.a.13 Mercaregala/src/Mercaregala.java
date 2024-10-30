/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Santiago Uribe Burgos
 */
import java.util.Scanner;

public class Mercaregala {
    private static Almacen almacen = new Almacen();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Añadir producto");
            System.out.println("2. Listar productos");
            System.out.println("3. Productos en peligro");
            System.out.println("4. Calculo precio medio");
            System.out.println("5. Eliminar bandejas");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    anadirProducto();
                    break;
                case 2:
                    almacen.listarProductos();
                    break;
                case 3:
                    almacen.listarProductosEnPeligro();
                    break;
                case 4:
                    System.out.println("Precio medio: " + almacen.calcularPrecioMedio() + " euros");
                    break;
                case 5:
                    almacen.eliminarBandejas();
                    System.out.println("Bandejas eliminadas.");
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 0);
    }

    private static void anadirProducto() {
        System.out.println("Tipo de producto (carne/pescado): ");
        String tipo = scanner.nextLine();
        
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        
        System.out.print("Peso (kilos): ");
        double peso = scanner.nextDouble();
        
        System.out.print("Precio por kilo: ");
        double precioKilo = scanner.nextDouble();
        scanner.nextLine(); // Limpiar buffer

        if (tipo.equalsIgnoreCase("carne")) {
            System.out.print("Origen (vacuno/avícola): ");
            String origen = scanner.nextLine();

            System.out.print("Tipo de carne (fresca/congelada): ");
            String tipoCarne = scanner.nextLine();

            if (tipoCarne.equalsIgnoreCase("fresca")) {
                System.out.print("Días de caducidad: ");
                int diasCaducidad = scanner.nextInt();
                almacen.anadirProducto(new CarneFresca(nombre, peso, precioKilo, origen, diasCaducidad));
            } else if (tipoCarne.equalsIgnoreCase("congelada")) {
                System.out.print("Empresa distribuidora: ");
                String empresaDistribuidora = scanner.nextLine();

                System.out.print("Tipo de carne congelada (entera/troceada): ");
                String tipoCongelada = scanner.nextLine();

                if (tipoCongelada.equalsIgnoreCase("entera")) {
                    System.out.print("¿Viene en bandeja? (true/false): ");
                    boolean enBandeja = scanner.nextBoolean();
                    almacen.anadirProducto(new CarneCongeladaPiezaEntera(nombre, peso, precioKilo, origen, empresaDistribuidora, enBandeja));
                } else if (tipoCongelada.equalsIgnoreCase("troceada")) {
                    System.out.print("Número medio de piezas: ");
                    int piezasMedias = scanner.nextInt();
                    almacen.anadirProducto(new CarneCongeladaPiezaTroceada(nombre, peso, precioKilo, origen, empresaDistribuidora, piezasMedias));
                }
            }
        } else if (tipo.equalsIgnoreCase("pescado")) {
            System.out.print("Tipo de pescado: ");
            String tipoPescado = scanner.nextLine();
            almacen.anadirProducto(new Pescado(nombre, peso, precioKilo, tipoPescado));
        }
    }
}

