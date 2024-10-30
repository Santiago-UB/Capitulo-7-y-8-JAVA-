/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Santiago Uribe Burgos
 */
import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CajaRegistrador caja = new CajaRegistrador("Caja Principal");
        int opcion;

        do {
            System.out.println("Menú:");
            System.out.println("1. Ingresar monedas");
            System.out.println("2. Listar contenido");
            System.out.println("3. Mostrar saldo");
            System.out.println("4. Extraer monedas");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el tipo de moneda (0.5, 1.0, 2.0, 5.0, 10.0): ");
                    double tipo = scanner.nextDouble();
                    System.out.print("Ingrese el número de unidades: ");
                    int unidades = scanner.nextInt();
                    if (caja.meterMonedas(tipo, unidades)) {
                        System.out.println("Monedas ingresadas correctamente.");
                    } else {
                        System.out.println("Error al ingresar monedas. Tipo inválido o unidades incorrectas.");
                    }
                    break;

                case 2:
                    double[] tipos = caja.getTiposDeMonedas();
                    System.out.println("Contenido de la caja:");
                    for (double t : tipos) {
                        System.out.println("Tipo: " + t + ", Unidades: " + caja.getUnidadesTipoMoneda(t));
                    }
                    break;

                case 3:
                    System.out.println("Saldo actual: " + caja.getSaldo() + " euros.");
                    break;

                case 4:
                    System.out.print("Ingrese el tipo de moneda a extraer: ");
                    double tipoExtraer = scanner.nextDouble();
                    System.out.print("Ingrese el número de unidades a extraer: ");
                    int unidadesExtraer = scanner.nextInt();
                    if (caja.sacarMonedas(tipoExtraer, unidadesExtraer)) {
                        System.out.println("Monedas extraídas correctamente.");
                    } else {
                        System.out.println("Error al extraer monedas. Tipo inválido o unidades insuficientes.");
                    }
                    break;

                case 5:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                    break;
            }
            System.out.println();
        } while (opcion != 5);

        scanner.close();
    }
}

