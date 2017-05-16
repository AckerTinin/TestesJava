package exjava2;
import java.util.*;
// author: Carlos André pereira Tinin
public class Main {
    public static void main(String[] args) {
      int i = 1, opcao, tipo;
      Scanner entrada = new Scanner(System.in);
      System.out.println("Bem vindo ao sistema de cadastro de carros!");
      List<Automovel> automovel = new LinkedList<Automovel>();
      Automovel automovelAux;
      while (i == 1) {
        System.out.println("Digite o número ao lado da opção:");
        System.out.println(" 1   -->   Cadastrar Carro\n 2   -->   Sair");
        opcao = entrada.nextInt();
        while (opcao == 1) {
          System.out.println("Informe o tipo de carro que deseja cadastrar: \n1   -->   Economico\n2   -->   Esportivo\n3   -->   Utilitário");
          tipo = entrada.nextInt();
          if (tipo == 1) {
              System.out.println("Criação de novo automovel Economico");
              automovelAux = new Economico();
              automovel.add(automovelAux);
          }
          if (tipo == 2) {
              System.out.println("Criação de novo automovel Esportivo");
              automovelAux = new Esportivo();
              automovel.add(automovelAux);
          }
          if (tipo == 3) {
              System.out.println("Criação de novo automovel Utilitário");
              automovelAux = new Utilitario();
              automovel.add(automovelAux);
          }
          System.out.println("Deseja cadastrar um novo carro? Digite 1 para sim e 3 para não");
          opcao = entrada.nextInt();
        }
        if (opcao == 2) {
          i = 1000;
        }
      }
      System.out.println(automovel.get(0).getModelo());
  }
//    public static void main(String[] args) {
//        CadCarro huebr = new CadCarro();
//        huebr.setVisible(true);
//    }
}
