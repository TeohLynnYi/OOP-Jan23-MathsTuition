public class Headmaster 
{

    //ATTRIBUTES
    private Name name;

    //CONSTRUCTORS
    public Headmaster() 
    {
        name = new Name();
    }

    public Headmaster(String lname) 
    {
        name = new Name(lname);
    }

    //SETTERS & GETTERS
    public void setName(String fname, String mname, String lname) 
    {
        name.setFName(fname);
        name.setMName(mname);
        name.setLName(lname);
    }

    public Name getName() 
    {
        return name;
    }

    public String getStringName() 
    {
        return name.getFullName();
    }
}