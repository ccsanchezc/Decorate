/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decoradores;

import Abstractos.AutoDecorate;
import Abstractos.Automovil;
import Abstractos.VentaAuto;

/**
 *
 * @author David
 */
public class Polarizado extends AutoDecorate{

    public Polarizado(VentaAuto automvil) {
        super(automvil);
    }

    @Override
    public String getDescripcion() {
        return getVentaAuto().getDescripcion() + "" + "Polarizado";
    }

    @Override
    public double getPrecio() {
        return getVentaAuto().getPrecio() + 30;
    }
    
}
