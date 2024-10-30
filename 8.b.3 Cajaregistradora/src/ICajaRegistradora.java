/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author Santiago Uribe Burgos
 */
public interface ICajaRegistradora {
    
    public String getNombre();
    public int getNumTipoMonedas();
    public int getUnidadesTipoMoneda(double tipo);
    public boolean meterMonedas(double tipo, int unidades);

    
    public boolean monedaValida(double tipo);
    public boolean sacarMonedas(double tipo, int unidades);


    public void vaciarCajaRegistradora();

    public double[] getTiposDeMonedas();


    public double getSaldo();
}

