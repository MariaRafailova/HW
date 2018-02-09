import java.util.List;

public interface MovieDAO {
    public List<Movie> select();
    public void increaseCount(int m_ID);
    public void decreaseCount(int m_ID);
}
