public class TuitionCenter 
{
    //ATTRIBUTES
    private Headmaster hm;
    private Address address;
    private TeacherBatch tb;
    private StudentBatch sb;

    //CONSTRUCTORS
    public TuitionCenter(int maxTutors, int maxStudents) 
    {
        hm = new Headmaster();
        address = new Address();
        tb = new TeacherBatch(maxTeacher);
        sb = new StudentBatch(maxStudents);
    }

    //SETTERS & GETTERS
    public void setHm(Headmaster hm) 
    {
        this.hm = hm;
    }

    public Headmaster getHm() 
    {
        return hm;
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

    public void setTb(TeacherBatch tb) 
    {
        this.tb = tb;
    }

    public TeacherBatch getTb() 
    {
        return tb;
    }

    public void setSb(StudentBatch sb) 
    {
        this.sb = sb;
    }

    public StudentBatch getSb() 
    {
        return sb;
    }
}
