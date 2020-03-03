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
public class Chevrolet_Sprint extends Automovil{

    public Chevrolet_Sprint(){
        this.descripcion = getDescripcion();
        this.precio = getPrecio();
    }
    @Override
    public String getDescripcion() {
        return "Soy Chevrolet";
    }

    @Override
    public double getPrecio() {
        return 16000;
    }
    
}
