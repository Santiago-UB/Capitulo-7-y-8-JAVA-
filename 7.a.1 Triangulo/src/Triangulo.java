/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Santiago Uribe Burgos
 */
public class Triangulo {
    
    private int base;
    private int altura;

    
    public Triangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    
    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    
    public double calcularArea() {
        return (base * altura) / 2.0;
    }
}
