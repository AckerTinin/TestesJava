package exjava2;

/**
 *
 * @author Carlos André pereira Tinin
 */
public class Economico extends Carro{
    public Economico() {
        super();
        this.precoSeguro = this.preco*0.5;
        System.out.println(" Preco do seguro = R$"+this.precoSeguro+"0\n Marca = "+this.marca+"\n Modelo = "+this.modelo+"\n Cor = "+this.cor);
    }
    private String MPrecoSeguro(double preco) {
        this.precoSeguro = preco*0.5;
        return "";
    }    
}