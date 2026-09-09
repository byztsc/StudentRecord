
public class StudentRecord {
    private int id;
    private String name;
    private String major;

    public StudentRecord(int id, String name, String major){
        this.id = id;
        this.name = name;
        this major = major;
    }
     public int getId()   { return id; }
    public String getName() { return name; }
    public String getMajor() { return major; }

    @Override
    public String toString() {
        return id + "," + name + "," + major;
        }
    }
}
