/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tshirtfactory;

import interfaces.IPayment;

/**
 *
 * @author Dim.Kasimatis
 */
public class CreditDebitCard implements IPayment {

    @Override
    public boolean pay(float amount) {
        System.out.printf("Payment of amount %s was made via Credit / Debit transaction!\n", amount + 5.0f);
        return(true);
    }
    
}
