/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Santiago Uribe Burgos
 */
public final class Reloj {
    
    private int hora;
    private int minuto;
    private int segundo;

    
    public Reloj(int hora, int minuto, int segundo) {
        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo);
    }

    
    public Reloj(int hora, int minuto) {
        this(hora, minuto, 0);
    }

    
    public Reloj(int hora) {
        this(hora, 0, 0);
    }

    
    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    
    public void setHora(int hora) {
        if (hora >= 0 && hora < 24) {
            this.hora = hora;
        } else {
            System.out.println("La hora debe estar entre 0 y 23.");
        }
    }

    public void setMinuto(int minuto) {
        if (minuto >= 0 && minuto < 60) {
            this.minuto = minuto;
        } else {
            System.out.println("El minuto debe estar entre 0 y 59.");
        }
    }

    public void setSegundo(int segundo) {
        if (segundo >= 0 && segundo < 60) {
            this.segundo = segundo;
        } else {
            System.out.println("El segundo debe estar entre 0 y 59.");
        }
    }

    
    public void adelantarReloj(int cantidadDeSegundos) {
        if (cantidadDeSegundos < 0) {
            System.out.println("La cantidad de segundos debe ser positiva.");
            return;
        }
        
        segundo += cantidadDeSegundos;
        
        
        while (segundo >= 60) {
            segundo -= 60;
            minuto++;
        }

        
        while (minuto >= 60) {
            minuto -= 60;
            hora++;
        }

        
        if (hora >= 24) {
            hora = hora % 24;
        }
    }

    
    public void atrasarReloj(int cantidadDeSegundos) {
        if (cantidadDeSegundos < 0) {
            System.out.println("La cantidad de segundos debe ser positiva.");
            return;
        }

        segundo -= cantidadDeSegundos;

        
        while (segundo < 0) {
            segundo += 60;
            minuto--;
        }

        
        while (minuto < 0) {
            minuto += 60;
            hora--;
        }

        
        if (hora < 0) {
            hora += 24;
        }
    }

    
    public String mostrarHora() {
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }
}

