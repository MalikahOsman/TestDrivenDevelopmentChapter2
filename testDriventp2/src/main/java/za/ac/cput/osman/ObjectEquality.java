package za.ac.cput.osman;

/**
 * Created by Malikah Osmen on 2016-03-06.
 */
public class ObjectEquality {


    private String fName;
    private String lName;
    private int age;

    public ObjectEquality(String nm, String ln, int a)
    {
        fName = nm;
        lName = ln;
        age = a;
    }
    public void setFirstName(String nm)
    {
        fName = nm;
    }

    public String getFirstName()
    {
        return "Malikah";
    }

    public void setLastName(String ln)
    {
        lName = ln;
    }
    public String getLastName()
    {
        return "Osman";
    }

    public void setAge(int a)
    {
        age = a;

    }
    public int getAge()
    {
        return age = 21;
    }
}
