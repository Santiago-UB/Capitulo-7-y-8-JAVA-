/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Santiago Uribe Burgos
 */
import java.util.Scanner;

public class PruebaMiString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Prueba de la clase MiString:");

    
        System.out.print("Ingresa una cadena para invertir: ");
        String cadena = scanner.nextLine();
        System.out.println("Cadena invertida: " + MiString.alReves(cadena));
        
    
        System.out.print("Ingresa una cadena para limpiar caracteres: ");
        String cadenaLimpia = scanner.nextLine();
        System.out.print("Ingresa los caracteres a eliminar: ");
        String caracteresAEliminar = scanner.nextLine();
        System.out.println("Cadena limpia: " + MiString.limpiaCaracteres(cadenaLimpia, caracteresAEliminar));

    
        System.out.print("Ingresa una cadena para sustituir caracteres: ");
        String cadenaSustituir = scanner.nextLine();
        System.out.print("Ingresa el caracter a sustituir: ");
        char original = scanner.next().charAt(0);
        System.out.print("Ingresa el caracter por el que será sustituido: ");
        char sustituto = scanner.next().charAt(0);
        scanner.nextLine(); 
        System.out.println("Cadena con sustituciones: " + MiString.sustituye(cadenaSustituir, original, sustituto));

        
        System.out.print("Ingresa una cadena para verificar si todos los caracteres son iguales: ");
        String cadenaIguales = scanner.nextLine();
        System.out.println("¿Todos los caracteres son iguales? " + MiString.todosIguales(cadenaIguales));

        
        System.out.print("Ingresa una cadena para quitar espacios: ");
        String cadenaConEspacios = scanner.nextLine();
        System.out.println("Cadena sin espacios: " + MiString.quitaEspacios(cadenaConEspacios));

    
        System.out.print("Ingresa una cadena para verificar si es un número entero: ");
        String cadenaNumerica = scanner.nextLine();
        System.out.println("¿Es un número entero? " + MiString.esNumeroEntero(cadenaNumerica));

        scanner.close();
    }
}
