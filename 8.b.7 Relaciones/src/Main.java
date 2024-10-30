/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Santiago Uribe Burgos
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Ingrese el primer número: ");
        Numero num1 = new Numero(scanner.nextInt());

        System.out.print("Ingrese el segundo número: ");
        Numero num2 = new Numero(scanner.nextInt());

        
        System.out.println("¿El primer número es mayor que el segundo? " + num1.esMayor(num2));
        System.out.println("¿El primer número es menor que el segundo? " + num1.esMenor(num2));
        System.out.println("¿El primer número es igual al segundo? " + num1.esIgual(num2));
    }
}
    
