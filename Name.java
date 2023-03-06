public class Name {

    //ATTRIBUTES
    private String fname;
    private String mname;
    private String lname;

    //CONSTRUCTORS

    public Name() {}

    public Name(String lname) {
        this.lname = lname;
    }

    //SETTERS
    public void setFName(String fname) {
        this.fname = fname;
    }

    public void setMName(String mname) {
        this.mname = mname;
    }

    public void setLName(String lname) {
        this.lname = lname;
    }

    //GETTERS
    public String getFName() {
        return fname;
    }

    public String getMName() {
        return mname;
    }

    public String getLName() {
        return lname;
    }

    public String getFullName() {
        return fname.concat(" " + mname + " " + lname);
    }
}