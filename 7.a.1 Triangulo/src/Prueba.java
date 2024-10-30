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
        
        Triangulo t1 = new Triangulo(5, 10);
        Triangulo t2 = new Triangulo(8, 15);

        
        System.out.println("Triángulo 1 - Base: " + t1.getBase() + ", Altura: " + t1.getAltura() + ", Área: " + t1.calcularArea());
        System.out.println("Triángulo 2 - Base: " + t2.getBase() + ", Altura: " + t2.getAltura() + ", Área: " + t2.calcularArea());

        
        t1.setBase(7);
        t1.setAltura(12);
        t2.setBase(10);
        t2.setAltura(20);

        
        System.out.println("Después de cambiar valores:");
        System.out.println("Triángulo 1 - Base: " + t1.getBase() + ", Altura: " + t1.getAltura() + ", Área: " + t1.calcularArea());
        System.out.println("Triángulo 2 - Base: " + t2.getBase() + ", Altura: " + t2.getAltura() + ", Área: " + t2.calcularArea());
    }
}

