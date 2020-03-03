/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstractos;

import Abstractos.AutoDecorate;
import Abstractos.Automovil;
import Abstractos.VentaAuto;

/**
 *
 * @author David
 */
public abstract class Radio extends AutoDecorate{

    public VentaAuto automovil;
    
    public Radio(VentaAuto automvil) {
        super(automvil);
    }

    public VentaAuto getAutomovil() {
        return automovil;
    }

    public void setAutomovil(VentaAuto automovil) {
        this.automovil = automovil;
    }

    
}
