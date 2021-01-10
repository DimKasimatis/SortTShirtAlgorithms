/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author Dim.Kasimatis
 */
public enum Fabric {
    WOOL(12), COTTON(15), POLYESTER(17),  RAYON(18.3f),  
    LINEN(19.4f),  CASHMERE(33.76f),  SILK(35.93f);
    
    private final float unitPrice;
    
    Fabric(float unitPrice) {
        this.unitPrice = unitPrice;
    }

    public float getUnitPrice() {
        return unitPrice;
    }
    
    
    
    
}
