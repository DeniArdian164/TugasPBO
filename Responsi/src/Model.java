import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Model {
    Statement statement;

    public int pinjamTambah(String memberId, String memberName, String bookId, String bookName){
        int result = 0;
        try {
            String query = "INSERT INTO peminjaman VALUES " +
                    "(DEFAULT, '" + memberId + "', '" +
                    memberName + "', '" + bookId + "', '" + bookName + "')";
            statement = KoneksiDatabase.getConnection().createStatement();
            statement.executeUpdate(query);
            result = 1;
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            result = 0;
        }
        return result;
    }

    public int getSumData(){
        int total = 0;
        try {
            String query = "SELECT COUNT(*) as Count FROM peminjaman";
            statement = KoneksiDatabase.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            if (resultSet.next()){
                total = resultSet.getInt("Count");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        return total;
    }

    public String[][] getAllData(){
        String[][] data = new String[getSumData()][5];
        try{
            String query = "SELECT * FROM peminjaman";
            statement = KoneksiDatabase.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            int i = 0;
            while (resultSet.next()){
                data[i][0] = resultSet.getString("Id");
                data[i][1] = resultSet.getString("MemberId");
                data[i][2] = resultSet.getString("MemberName");
                data[i][3] = resultSet.getString("BookId");
                data[i][4] = resultSet.getString("BookName");
                i++;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        return data;
    }

    public int tampilHapus(Perpustakaan perpustakaan){
        int result = 0;
        try {
            String query = "DELETE FROM peminjaman WHERE Id = '" + perpustakaan.getId() + "'";
            statement = KoneksiDatabase.getConnection().createStatement();
            statement.executeUpdate(query);
            result = 1;
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        return result;
    }

    public int editEdit(Perpustakaan perpustakaan){
        int result = 0;
        try {
            String query = "UPDATE peminjaman SET " +
                    "MemberId = '" + perpustakaan.getMemberId() + "', MemberName = '" + perpustakaan.getMemberName() + "', " +
                    "BookId = '" + perpustakaan.getBookId() + "', BookName = '" + perpustakaan.getBookName() + "' " +
                    "WHERE Id = '" + perpustakaan.getId() + "'";
            statement = KoneksiDatabase.getConnection().createStatement();
            statement.executeUpdate(query);
            result = 1;
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        return result;
    }
}