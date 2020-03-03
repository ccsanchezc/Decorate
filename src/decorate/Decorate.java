/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorate;

import Concretos.BMW;
import Abstractos.VentaAuto;
import Concretos.Chevrolet_Sprint;
import Decoradores.Blindaje;
import Decoradores.DVD;
import Decoradores.GPS;
/**
 *
 * @author David
 */
public class Decorate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        VentaAuto auto = new BMW();
        auto = new Blindaje(auto);
        
        System.out.println("Su descripcion es: " + auto.getDescripcion());
        System.out.println("Su precio es: " + auto.getPrecio());
        
        VentaAuto auto1 = new Chevrolet_Sprint();
        auto1 = new DVD(auto1);
        auto1 = new GPS(auto1);
        System.out.println("Su descripcion es: " + auto1.getDescripcion());
        System.out.println("Su precio es: " + auto1.getPrecio());
        
    }
    
}
