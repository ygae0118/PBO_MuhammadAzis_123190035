package Formulir;

import java.sql.*;

public class Connect {
    String DBurl = "jdbc:mysql://localhost/dataformulir";
    String DBusername = "root";
    String DBpassword = "";
    Connection koneksi;
    Statement statement;

    public Connect() {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            koneksi = (Connection) DriverManager.getConnection(DBurl,DBusername,DBpassword);
            System.out.println("Koneksi Berhasil");
        }catch(Exception ex){
            System.out.println("Koneksi gagal");
        }
    }

    
}
