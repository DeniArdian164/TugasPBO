import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class KoneksiDatabase {
    private static Connection connection;
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DBurl = "jdbc:mysql://localhost/r_perpus";
    static final String DBusername = "root";
    static final String DBpassword = "";

    public static Connection getConnection(){
        if(connection==null){
            try {
                Class.forName(JDBC_DRIVER);
                connection =  DriverManager.getConnection(DBurl,DBusername, DBpassword);
                System.out.println("Koneksi Berhasil");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getStackTrace());
                System.out.println("Koneksi Gagal " + ex.getMessage());
            }
        }
        return connection;
    }
}