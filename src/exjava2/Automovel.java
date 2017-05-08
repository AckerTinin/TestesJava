package exjava2;
import java.util.Scanner;

public class Automovel {
    private String marca;
    private String modelo;
    private final double preco;
    private double precoSeguro;
    private final String cor;
    
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
    
    private String precoSeguro(double preco) {
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
        precoSeguro(preco);
    }
    
}
