public class Client {
    private int cl_ID;
    private String name;
    private String contact;

    public Client(String name, String contact) {
        this.name = name;
        this.contact = contact;
    }

    public Client(int cl_ID){
        this.cl_ID = cl_ID;
    }

    public int getCl_ID() {
        return cl_ID;
    }

    @Override
    public String toString() {
        return "Client "+ name + ", ID " +cl_ID;
    }

    public void setCl_ID(int cl_ID) {
        this.cl_ID = cl_ID;
    }

    public void setName(String name) {
        this.name = name;
    }
}
