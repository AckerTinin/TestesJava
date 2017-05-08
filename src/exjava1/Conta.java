package exjava1;
import java.util.Scanner;

public class Conta {
    private int nConta;
    private String cliente;
    private double saldo;
    private double limite;
    public static void main(String[] args) {
        Conta conta2 = new Conta(); // contrutor 1 
    }
    private String sacar(double quantidade) {
        this.saldo -= quantidade;
        return "Seu saldo é: R$" + this.saldo + ".";
    }
    public int getNConta() {  
        return this.nConta;
    }
    public Conta() {
        System.out.println("----------------------------------------------");
        System.out.println("---------Welcome to summoner's rift.----------");
        System.out.println("----------------------------------------------\n");
        int opcao = 1;
        Conta conta =  new Conta(10, "Carlos Tinin", 2000, 300); // construtor 2
        Scanner entrada = new Scanner(System.in);
        while (opcao != 3){
            System.out.println("\n----  1   -->   Acessar conta.");
            System.out.println("----  2   -->   Jogar Apertadinho.");
            System.out.println("----  3   -->   Sair.\n");
            System.out.println("Digite o numero ao lado da opção para acessar:");
            opcao = entrada.nextInt();
            if (opcao == 1) {
                System.out.println("\nNúmero da conta: " + conta.getNConta());
                System.out.println("Nome: " + conta.getCliente());
                System.out.println("Saldo: R$" + conta.getSaldo() + "0");
                System.out.println("Limite: R$" + conta.getLimite() + "0\n");
                System.out.println("Digite 1 para voltar ao menu e 3 para sair.");
                opcao = entrada.nextInt();            
            }
            else if (opcao == 2) {
                System.out.println("\nEm desenvolvimeto...");
                System.out.println("Digite 1 para voltar ao menu e 3 para sair.\n");
                opcao = entrada.nextInt();
            }
        }
        System.out.println("Bye Bye");
    }
    public Conta(int nConta, String cliente, double saldo, double limite) {
        this.nConta = nConta;
        this.cliente = cliente;
        this.saldo = saldo;
        this.limite = limite;
    }
    public void setNConta(int valor){
        this.nConta = valor;
    }
    public String getCliente() {
        return this.cliente;
    }
    public void setCliente(String nome) {
        this.cliente = nome;
    }
    public double getSaldo() {
        return this.saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public double getLimite() {
        return this.limite;
    }
    public void setLimite(double limite) {
        this.limite = limite;
    }
}
