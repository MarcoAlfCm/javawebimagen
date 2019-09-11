package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conectar{

    static String login = "testdb";
    static String password = "testdb";
    static String url = "jdbc:oracle:thin:@localhost:1521:XE";
    Connection connection = null;

    public Conectar(){ 
        try{
        Class.forName("oracle.jdbc.OracleDriver");
        connection = DriverManager.getConnection(url,login,password);
        if (connection!=null){
            System.out.println("no se pudo conecta");
        }
        }catch(SQLException ex){
            ex.getMessage();
            ex.getStackTrace();
        }catch(Exception ex){
            ex.getMessage();
            ex.getStackTrace();
        }
    }

    public Connection getConnection(){
        return connection;
    }

    public void desconectar(){
        connection = null;
    }


}
