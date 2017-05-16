package exjava1;

public class Exemplo {
    String nome = "Hello";
    String[] acs = new String[10];
    public static void main(String[] args) {
        System.out.println("sauhusah");
        Exemplo exemplo = new Exemplo();
        exemplo.metodo();
        
    }
    public void metodo() {
        System.out.println(this.nome);
    }
}



