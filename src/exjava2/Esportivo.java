package exjava2;

/**
 *
 * @author Carlos André pereira Tinin
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