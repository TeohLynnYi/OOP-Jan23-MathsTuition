// createed by team in Bangalore
public class Teacher 
{
    // Attributes
    private Name name;
    private String ic;
    private Address address;
    private int numyearexp;
    private String qualification;
    private StudentBatch students;
    
    // Constructors
    public Teacher() {}
    
    public Teacher(String lname) 
    {
        name = new Name(lname);
    }

    public Teacher(String lname) 
    {
        name = new Name(lname);
        address = new Address();
        students = new StudentBatch(maxStudents);
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

    public void setIC(String ic) 
    {
        this.ic = ic;
    }

    public String getIC() 
    {
        return ic;
    }

    public void setAddress(String line1, String line2, String postcode, String city, String state) 
    {
        address.setLine1(line1);
        address.setLine2(line2);
        address.setPostcode(postcode);
        address.setCity(city);
        address.setState(state);
    }

    public Address getAddress() 
    {
        return address;
    }

    public String getStringAddress() 
    {
        return address.getFullAddress();
    }

    public void setQualification(String qualification) 
    {
        this.qualification = qualification;
    }

    public String getQualification() 
    {
        return qualification;
    }

    public void setNumYearExp(int numyearexp) 
    {
        this.numyearexp = numyearexp;
    }

    public int getNumYearExp() 
    {
        return numyearexp;
    }
    
    public void setStudents(StudentBatch students) 
    {
        this.students = students;
    }

    public StudentBatch getStudents() 
    {
        return students;
    }

}