/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstractos;

/**
 *
 * @author David
 */
public abstract class AutoDecorate extends VentaAuto{
    public VentaAuto ventaAuto;
    
    public AutoDecorate(VentaAuto automvil) {
        setVentaAuto(automvil);
    }

    public VentaAuto getVentaAuto() {
        return ventaAuto;
    }

    public void setVentaAuto(VentaAuto ventaAuto) {
        this.ventaAuto = ventaAuto;
    }
    
    
}
