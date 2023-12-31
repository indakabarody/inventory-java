/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.*;

/**
 *
 * @author indak
 */
public class InventoryDB {

    String user = "root";
    String pass = "";
    private ResultSet rs = null;
    private Connection cn = null;
    private Statement st = null;
    public static String PathReport = System.getProperty("user.dir") + "/src/report/report1.jasper";
    private static Connection koneksi;

    public static Connection getKoneksi() {
        if (koneksi == null) {
            try {
                String url = new String();
                String user = new String();
                String password = new String();
                url = "jdbc:mysql://localhost:3306/db_inventory";
                user = "root";
                password = "";
                koneksi = DriverManager.getConnection(url, user, password);
            } catch (SQLException e) {
                System.out.println("Error Membuat Koneksi");
            }
        }

        return koneksi;
    }
}
