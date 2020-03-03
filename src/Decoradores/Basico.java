/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decoradores;

import Abstractos.Radio;
import Abstractos.VentaAuto;

/**
 *
 * @author David
 */
public class Basico extends Radio{

    public Basico(VentaAuto automvil) {
        super(automvil);
    }

    @Override
    public String getDescripcion() {
        return getVentaAuto().getDescripcion() + "Radio " + "Basico ";
    }

    @Override
    public double getPrecio() {
        return getVentaAuto().getPrecio() + 30;
    }
    
}
