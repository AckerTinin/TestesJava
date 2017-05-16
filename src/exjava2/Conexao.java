package exjava2;

// author: Carlos André pereira Tinin
import java.sql.*;
import java.util.*;
public class Conexao {
    public static void main(String args[]) {
    try{
        String url = "jdbc:odbc:automovel";
        String usuario = "root";
        String senha = "root";
        
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        Connection con;
        con = DriverMananger.getConnection(url,usuario,senha);
        System.out.println("Conexão estabelecida com sucesso!");
        con.close();
        }
        catch(Exception e){
            System.out.println("Conexão não foi estabelecida!");
        }
    }
    }
}
