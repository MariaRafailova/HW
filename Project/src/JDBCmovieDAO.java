import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class JDBCmovieDAO implements MovieDAO{

    @Override
    public List<Movie> select() {
        List<Movie> persons = new LinkedList<Movie>();
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/video_library","root","...");
             Statement statement = con.createStatement();
             ResultSet rs = statement.executeQuery("select m_ID, title from movies;")) {
            while (rs.next()) {
                System.out.printf("%d;%s",
                        rs.getInt("m_ID"),
                        rs.getString("title"));
            }

        } catch (SQLException ex) {
            while (ex != null) {
                System.out.println(ex.getSQLState());
                System.out.println(ex.getMessage());
                System.out.println(ex.getErrorCode());
                ex = ex.getNextException();
            }
        }
        return null;
    }

    @Override
    public void increaseCount(int m_ID) {
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/video_library","root","...");
             PreparedStatement statement = con.prepareStatement("UPDATE movies SET countM = countM+1 WHERE m_ID = ?;");) {
            statement.setInt(1,m_ID);

            ResultSet rs = statement.executeQuery();

        } catch (SQLException ex) {
            while (ex != null) {
                System.out.println(ex.getSQLState());
                System.out.println(ex.getMessage());
                System.out.println(ex.getErrorCode());
                ex = ex.getNextException();
            }
        }
    }

    @Override
    public void decreaseCount(int m_ID) {
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/video_library","root","...");
             PreparedStatement statement = con.prepareStatement("UPDATE movies SET countM = countM-1 WHERE m_ID = ?;");) {
            statement.setInt(1,m_ID);

            ResultSet rs = statement.executeQuery();

        } catch (SQLException ex) {
            while (ex != null) {
                System.out.println(ex.getSQLState());
                System.out.println(ex.getMessage());
                System.out.println(ex.getErrorCode());
                ex = ex.getNextException();
            }
        }
    }
}
