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
public class Utilitario extends Carro{
    private float volumeCarga;

    public Utilitario(float volumeCarga) {
        this.volumeCarga = volumeCarga;
    }
    
    public float getVolumeCarga() {
        return volumeCarga;
    }

    public void setVolumeCarga(float volumeCarga) {
        this.volumeCarga = volumeCarga;
    }
    
}
