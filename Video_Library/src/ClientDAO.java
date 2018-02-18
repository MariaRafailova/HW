
public interface ClientDAO {
    public void takeMovie(int cl_ID, int m_ID,String date);
    public void returnMovie(int cl_ID, int m_ID,String date);
    public void payTax(int cl_ID, int m_ID,String date);
}
