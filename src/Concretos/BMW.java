package Concretos;


import Abstractos.Automovil;
import Abstractos.VentaAuto;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David
 */
public class BMW extends Automovil{
    
    public BMW(){
        descripcion = getDescripcion();
        precio = getPrecio();
    }

    @Override
    public String getDescripcion() {
        return " Soy BMW";
    }

    @Override
    public double getPrecio() {
        return 20000;
    }
    
}
