/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * @author = Carlos André pereira Tinin 
 */
package exjava2;
import java.util.*;

public class Carro extends Automovel{
    protected List<String> acessorios = new LinkedList<String>();
    public Carro() {
        int i, qtd;
        String ac;
        System.out.println("Informe a quantidade de acessorios");
        Scanner entrada = new Scanner(System.in);
        qtd = entrada.nextInt();
        entrada.nextLine();
        for (i = 0; i < qtd; i++) {
          System.out.println("Informe o acessorio "+(i+1)+": ");
          ac = entrada.nextLine();
          this.acessorios.add(ac);
        }
        System.out.println(acessorios);
    }
}

