import java.sql.*;
import javax.swing.JOptionPane;

public class Model {
    
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String dburl = "jdbc:mysql://localhost/dbc";
    static final String user = "root";
    static final String pass = "";
    
    Connection koneksi;
    Statement statement;
    
    public Model() {
        try {
            Class.forName(JDBC_DRIVER);
            koneksi = (Connection)DriverManager.getConnection(dburl, user, pass);
            System.out.println("Koneksi Berhasil!");
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            System.out.println("Koneksi Gagal!");
        }
    }
    
    public void inputData(String Nama, String NoHP, String Umur, String Email) {
        try {
            String query = "INSERT INTO `contact` (`Nama`,`NoHP`,`Umur`,`Email`) VALUES ( '" +Nama+ "' , '" +NoHP+ "' , '" +Umur+ "' , '" +Email+ "')";
            statement = (Statement)koneksi.createStatement();
            statement.executeUpdate(query);
            System.out.println("Data Berhasil Ditambah!");
            JOptionPane.showMessageDialog(null, "Data Berhasil Ditambah!");
        }
        catch(SQLException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public String[][] outputData() {
        int contact = 0;
        try {
            String data[][] = new String [ getJumlah() ][4];
            String query = "SELECT * FROM contact";
            ResultSet rS = statement.executeQuery(query);
            while(rS.next()) {
                data[contact][0] = rS.getString("Nama");
                data[contact][1] = rS.getString("NoHP");
                data[contact][2] = rS.getString("Umur");
                data[contact][3] = rS.getString("Email");
                contact = contact + 1;
            }
            return data;
        }
        catch(SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("Database Error!");
            return null;
        }
    }
    
    public int getJumlah() {
        int contact = 0;
        try {
            statement = (Statement)koneksi.createStatement();
            String query = "SELECT * FROM contact";
            ResultSet rS = statement.executeQuery(query);
            while(rS.next()) {
                contact = contact + 1;
            }
            return contact;
        }
        catch(SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("Database Error!");
            return 0;
        }
    }
    
    public void updateData (String Nama, String NoHP, String Umur, String Email) {
        try {
            String query = "UPDATE contact SET NoHP = '" +NoHP+ "', Umur = '" +Umur+ "', Email = '" +Email+ "' WHERE Nama = '" +Nama+ "' ";
            statement = koneksi.createStatement();
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Data Berhasil Diupdate!");
        }
        catch(SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public void deleteData (String Nama) {
        try{
            String query = "DELETE FROM `contact` WHERE `Nama` = '"+Nama+"'";
            statement = koneksi.createStatement();
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Kontak Berhasil Dihapus!");
            
        }catch(SQLException sql) {
            System.out.println(sql.getMessage());
        }
    }
    
}
