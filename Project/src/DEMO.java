import java.util.Scanner;

public class DEMO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your client ID:");
        int cl_ID = sc.nextInt();

        System.out.println("Please select: " +
                "1.To take a movie" +
                " or " +
                "2.To return a movie");
        int selection = sc.nextInt();

        JDBCclientDAO jdbcClientDAO = new JDBCclientDAO();
        JDBCmovieDAO jdbcMovieDAO = new JDBCmovieDAO();

        if(selection == 1){
            jdbcMovieDAO.select();

            System.out.println("Please selected movie ID:");
            int m_ID = sc.nextInt();

            jdbcClientDAO.takeMovie(cl_ID, m_ID, "2018-02-08");
            jdbcMovieDAO.decreaseCount(m_ID);
        }
        else if (selection == 2){
            System.out.println("Please enter the movie ID you will return:");
            int m_ID = sc.nextInt();

            jdbcClientDAO.returnMovie(cl_ID, m_ID, "2018-02-10");
            jdbcMovieDAO.increaseCount(m_ID);
            jdbcClientDAO.payTax(cl_ID,m_ID,"2018-02-10");
        }
        else {
            System.out.println("Invalid number. " +
                    "Please select: " +
                    "1.To take a movie" +
                    " or " +
                    "2.To return a movie");
        }

    }

}
