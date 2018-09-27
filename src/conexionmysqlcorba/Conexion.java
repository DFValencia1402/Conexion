package conexionmysqlcorba;
import java.sql.*;

public class Conexion{
    public Connection conex;
    
    public Connection conectar(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conex = DriverManager.getConnection("jdbc:mysql://localhost/prueba","root","");
            System.out.print("Conexion Establecida");
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return conex;
}
}
