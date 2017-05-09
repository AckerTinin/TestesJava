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
public class Esportivo extends Carro{
    public Esportivo() {
        super();
        this.precoSeguro = this.preco*0.05;
        System.out.println("Preco do seguro = R$"+precoSeguro+"0");
    }
    private String MPrecoSeguro(double preco) {
        this.precoSeguro = this.preco*0.05;
        return "";
    }
}
