package ZarzadzanieBudynkiem;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 klasa abstrakcyjna
 */
public abstract class UrzadzenieElektryczne implements ZuzycieEnergii {
    public int zuzycie;
    
    
    
    // te metody sa wywolywane tylko przez inne metody

    @Override
    public void zwieksz(Stan stan) {
        stan.zuzycieEnergi += this.zuzycie;
    }


    @Override
    public void zmniejsz(Stan stan) {
        stan.zuzycieEnergi -= this.zuzycie;
    }
}
