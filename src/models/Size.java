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
public enum Size {
    XS(1), S(1), M(1.5f), L(1.5f), XL(2), XXL(2.5f), XXXL(2.5f);

    private final float unitPrice;

    Size(float unitPrice) {
        this.unitPrice = unitPrice;
    }

    public float getUnitPrice() {
        return unitPrice;
    }

}


