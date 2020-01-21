package db;
public class Std
{
    private int id;
    private String name;

    public Std(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Std()
    {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

