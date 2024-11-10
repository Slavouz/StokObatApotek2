package com.knyghtw.stokobatapotek.maven.koneksi;

/**
 *
 * @author davinky
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class koneksi {

    private static Connection connect;

    public static Connection koneksiDB() throws SQLException {
        if (connect == null) {
            try {
                String projectDir = System.getProperty("user.dir");
                String url = "jdbc:sqlite:" + projectDir + "\\src\\main\\java\\com\\knyghtw\\stokobatapotek\\maven\\db\\apotek.db";
                connect = DriverManager.getConnection(url);
                System.out.println("Koneksi sukses");
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Koneksi gagal, menutup aplikasi...");
                System.out.println(e);
                System.exit(0);
            }
        }
        return connect;
    }
}
