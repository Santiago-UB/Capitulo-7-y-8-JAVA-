/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Santiago Uribe Burgos
 */
public class Persona {
    char estadoCivil; 
    int sueldo;
    boolean mujer;

    
    public Persona(char estadoCivil, int sueldo, boolean mujer) {
        this.estadoCivil = estadoCivil;
        this.sueldo = sueldo;
        this.mujer = mujer;
    }

    
    public char getEstadoCivil() {
        return estadoCivil;
    }

    public int getSueldo() {
        return sueldo;
    }

    public boolean isMujer() {
        return mujer;
    }
}

