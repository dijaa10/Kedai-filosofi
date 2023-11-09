/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package koneksi;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

/**
 *
 * @author chodi
 */
public class config {
    public static Connection mysqlconfig;
    public  static Connection configDB()throws SQLException{
        try {
            String url = "jdbc:mysql://localhost:3306/filosofi";
            String user = "root";
            String pass = "";
            String JDBC_DRIVER = "com.mysql.jdbc.Driver";
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            mysqlconfig = DriverManager.getConnection(url, user, pass);
        }catch(Exception e){
            System.err.println("Koneksi Gagal "+e.getMessage());
        }
        return mysqlconfig;
    }
}
