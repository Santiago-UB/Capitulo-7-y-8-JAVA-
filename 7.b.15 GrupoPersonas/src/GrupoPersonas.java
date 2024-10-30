    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Santiago Uribe Burgos
 */
public class GrupoPersonas {
    private final Persona[] personas;
    private int totalPersonas;

    
    public GrupoPersonas() {
        this.personas = new Persona[100]; 
        this.totalPersonas = 0;
    }

    
    public boolean añadirPersona(Persona persona) {
        if (totalPersonas < 100) {
            personas[totalPersonas] = persona;
            totalPersonas++;
            return true; 
        }
        return false; 
    }

    
    public int contarMujeres() {
        int contador = 0;
        for (int i = 0; i < totalPersonas; i++) {
            if (personas[i].isMujer()) {
                contador++;
            }
        }
        return contador;
    }

    
    public int contarHombresCasados() {
        int contador = 0;
        for (int i = 0; i < totalPersonas; i++) {
            if (!personas[i].isMujer() && personas[i].getEstadoCivil() == 'c') {
                contador++;
            }
        }
        return contador;
    }

    
    public boolean sueldoMedioHombresSolterosMayor() {
        int totalSolteros = 0;
        int totalSueldoSolteros = 0;
        int totalCasados = 0;
        int totalSueldoCasados = 0;

        for (int i = 0; i < totalPersonas; i++) {
            if (!personas[i].isMujer()) { 
                if (personas[i].getEstadoCivil() == 's') {
                    totalSolteros++;
                    totalSueldoSolteros += personas[i].getSueldo();
                } else if (personas[i].getEstadoCivil() == 'c') {
                    totalCasados++;
                    totalSueldoCasados += personas[i].getSueldo();
                }
            }
        }

        double sueldoMedioSolteros = totalSolteros > 0 ? (double) totalSueldoSolteros / totalSolteros : 0;
        double sueldoMedioCasados = totalCasados > 0 ? (double) totalSueldoCasados / totalCasados : 0;

        return sueldoMedioSolteros > sueldoMedioCasados;
    }
}

