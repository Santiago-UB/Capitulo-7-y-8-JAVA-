/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Santiago Uribe Burgos
 */
public class Numero implements IRelaciones {
    private int valor;

    public Numero(int valor) {
        this.valor = valor;
    }

    @Override
    public boolean esMayor(Object b) {
        if (b instanceof Numero) {
            return this.valor > ((Numero) b).valor;
        }
        throw new IllegalArgumentException("El objeto no es una instancia de Numero");
    }

    @Override
    public boolean esMenor(Object b) {
        if (b instanceof Numero) {
            return this.valor < ((Numero) b).valor;
        }
        throw new IllegalArgumentException("El objeto no es una instancia de Numero");
    }

    @Override
    public boolean esIgual(Object b) {
        if (b instanceof Numero) {
            return this.valor == ((Numero) b).valor;
        }
        throw new IllegalArgumentException("El objeto no es una instancia de Numero");
    }

    public int getValor() {
        return valor;
    }
}

