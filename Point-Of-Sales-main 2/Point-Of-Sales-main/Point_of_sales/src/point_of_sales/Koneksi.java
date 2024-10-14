/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package point_of_sales;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author acer
 */
public class Koneksi {
    public static void main(String[] args) {
        // Mencoba membuat koneksi ke database dengan memanggil metode getKoneksi()
        Koneksi.getKoneksi();
    }
     private static Connection koneksi;
     
      public static Connection getKoneksi() {
        if (koneksi == null) {
            try {
                String url = "jdbc:mysql://localhost:3306/kasir";
                String user = "root";
                String password = "";
               koneksi = DriverManager.getConnection(url, user, password);
                System.out.println("Koneksi Berhasil");
            } catch (SQLException e) {
                // Menangani SQLException dan menampilkan pesan error
                System.out.println("Koneksi Gagal");
                e.printStackTrace();
            }
        }
        return koneksi;
      }


    
}
