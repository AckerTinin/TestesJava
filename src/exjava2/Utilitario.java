package exjava2;
import java.util.*;
/**
 *
 * @author Carlos André pereira Tinin
 */
public class Utilitario extends Carro{
    protected float volumeCarga;

    public Utilitario() {
        System.out.println("Informe o volume da carga: ");
        Scanner entrada = new Scanner(System.in);
        this.volumeCarga = entrada.nextFloat();
    }
    
    public float getVolumeCarga() {
        return volumeCarga;
    }

    public void setVolumeCarga(float volumeCarga) {
        this.volumeCarga = volumeCarga;
    }
    
}