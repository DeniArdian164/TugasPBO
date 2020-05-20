import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ModelSignIn {

    Statement statement;

    public int getCountForSignIn(String username, String password){
        int count = 0;
        try {
            String query = "SELECT COUNT(*) as count FROM akun " +
                    "WHERE Username = '" + username + "' AND Password = '" + password + "'";
            statement = (Statement) KoneksiDatabase.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            if (resultSet.next())
                count = resultSet.getInt("count");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        return count;
    }

    public int checkAlreadyAkun(String username){
        int count = 0;
        try {
            String query = "SELECT COUNT(*) as count FROM akun " +
                    "WHERE Username = '" + username + "'";
            statement = (Statement) KoneksiDatabase.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            if (resultSet.next())
                count = resultSet.getInt("count");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        return count;
    }

    public int insertAkun(String username, String password){
        int count = 0;
        try {
            if (checkAlreadyAkun(username) == 0){
                String query = "INSERT INTO akun VALUES" +
                        "('" + username + "','" + password + "')";
                statement = (Statement) KoneksiDatabase.getConnection().createStatement();
                statement.executeUpdate(query);
                count = 1;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        return count;
    }
}