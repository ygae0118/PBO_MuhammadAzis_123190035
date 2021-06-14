package Formulir;

 /* @author GF63-9SC-621ID*/

import java.sql.*;

public class Connect {
    
    String DBurl = "jdbc:mysql://localhost/form_daftar";
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
            System.out.println("Koneksi Gagal");
        }
    }

    
}
