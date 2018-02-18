public class Movie {
    private int m_ID;
    private String title;
    private int count;
    private int tax;

    public Movie(int m_ID, String title, int count) {
        this.m_ID = m_ID;
        this.title = title;
        this.count = count;
        this.tax = 5; //lv
    }

    @Override
    public String toString() {
        return "Movie{" +
                "m_ID=" + m_ID +
                ", title='" + title + '\'' +
                ", count=" + count +
                '}';
    }

    public int getM_ID() {
        return m_ID;
    }

    public String getTitle() {
        return title;
    }

    public int getCount() {
        return count;
    }

    public void setM_ID(int m_ID) {
        this.m_ID = m_ID;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
