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
public enum Color {
    RED(1), ORANGE(1), YELLOW(1), GREEN(1), BLUE(1), INDIGO(2), VIOLET(2.5f);

    private final float unitPrice;

    Color(float unitPrice) {
        this.unitPrice = unitPrice;
    }

    public float getUnitPrice() {
        return unitPrice;
    }

}
