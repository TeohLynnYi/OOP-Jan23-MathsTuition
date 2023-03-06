public class Address {

    //ATTRIBUTES
    private String line1;
    private String line2;
    private String postcode;
    private String city;
    private String state;

    //CONSTRUCTORS
    public Address(){}

    //SETTERS
    public void setLine1(String line1) 
    {
        this.line1 = line1;
    }

    public void setLine2(String line2) 
    {
        this.line2 = line2;
    }

    public void setPostcode(String postcode) 
    {
        this.postcode = postcode;
    }

    public void setCity(String city) 
    {
        this.city = city;
    }

    public void setState(String state) 
    {
        this.state = state;
    }

    //GETTERS
    public String getLine1() 
    {
        return line1;
    }

    public String getLine2() 
    {
        return line2;
    }

    public String getPostcode() 
    {
        return postcode;
    }

    public String getCity() 
    {
        return city;
    }

    public String getState() 
    {
        return state;
    }

    public String getFullAddress() 
    {
        return line1.concat(", " + line2 + ", " + postcode + ", " + city + ", " + state);
    }
}