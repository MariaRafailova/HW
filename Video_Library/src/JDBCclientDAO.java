

import java.sql.*;

public class JDBCclientDAO implements ClientDAO {

    @Override
    public void takeMovie(int cl_ID, int m_ID, String date) {
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/video_library","root","...");
            PreparedStatement statement = con.prepareStatement("insert into client_movie (cl_ID,m_ID,date) values (?,?,?)");) {
            statement.setInt(1,cl_ID);
            statement.setInt(2,m_ID);
            statement.setString(3, date);

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
    public void returnMovie(int cl_ID, int m_ID, String date) {
        try (
             Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/video_library","root","...");
             PreparedStatement statement = con.prepareStatement("DELETE FROM client_movie WHERE cl_id=? and m_id=?;");) {
            statement.setInt(1,cl_ID);
            statement.setInt(2,m_ID);
            statement.setString(3, date);
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
    public void payTax(int cl_ID, int m_ID, String date) {
        //tax += today date - return date
    }


}
