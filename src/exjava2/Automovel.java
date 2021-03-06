package exjava2;
import java.util.Scanner;
// @author Carlos André pereira Tinin
public class Automovel {
    protected String marca;
    protected String modelo;
    protected final double preco;
    protected double precoSeguro;
    protected final String cor;
    
    public String getMarca() {
       return this.marca; 
    }
    
    public String getModelo() {
        return this.modelo;
    }
    
    public double getPreco() {
       return this.preco;
    }
    
    public double getPrecoSeguro() {
        return this.precoSeguro;
    }
    
    public String getCor() {
        return this.cor;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setPrecoSeguro(double precoSeguro) {
        this.precoSeguro = precoSeguro;
    }
    
    private String MPrecoSeguro(double preco) {
        this.precoSeguro = preco*0.01;
        System.out.println("Preco do seguro = R$"+precoSeguro+"0");
        return "";
    }

    public Automovel() { 
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe a marca do veículo: ");
        this.marca = entrada.next(); 
        System.out.println("Informe o modelo de veículo: ");
        this.modelo = entrada.next();
        System.out.println("Informe o preco do veículo: ");
        this.preco = entrada.nextDouble();
        System.out.println("Informe a cor do veículo: ");
        this.cor = entrada.next();
        this.precoSeguro = this.preco*0.01;
    }
    
}