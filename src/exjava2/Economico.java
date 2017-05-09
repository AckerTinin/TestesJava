/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exjava2;

/**
 *
 * @author chp51175
 */
public class Economico extends Carro{
    public Economico() {
        super();
        this.precoSeguro = this.preco*0.5;
        System.out.println("Preco do seguro = R$"+precoSeguro+"0");
    }
    private String MPrecoSeguro(double preco) {
        this.precoSeguro = preco*0.5;
        return "";
    }    
}
