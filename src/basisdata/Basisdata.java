package basisdata;

/**
 *
 * @author aril
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Basisdata {
    private static Connection koneksi;
    public static Connection getKoneksi() {
        if (koneksi == null) {
            try {
                String connectionUrl = "jdbc:sqlserver://LAPTOP-3K99IF44\\SQLEXPRESS:1433;databaseName=Trans_1001;user=aril;password=1234;encrypt=true;trustServerCertificate=true";
                DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());
                koneksi = DriverManager.getConnection(connectionUrl);
                System.out.println("Koneksi berhasil");
            } catch (SQLException e) {
                System.out.println("Koneksi error / tidak berhasil");
                e.printStackTrace();
            }
        }
        return koneksi;
    }
}