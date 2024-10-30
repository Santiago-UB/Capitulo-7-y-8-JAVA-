/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Santiago Uribe Burgos
 */
public class CarneCongeladaPiezaTroceada extends CarneCongelada {
    private int piezasMedias;

    public CarneCongeladaPiezaTroceada(String nombre, double peso, double precioKilo, String origen, String empresaDistribuidora, int piezasMedias) {
        super(nombre, peso, precioKilo, origen, empresaDistribuidora);
        this.piezasMedias = piezasMedias;
    }

    public int getPiezasMedias() {
        return piezasMedias;
    }
}

