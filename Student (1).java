public class Student {
    
    // Attributes
    private Name name;
    private String kp;
    private Address address;
    private String schoolname;
    private Teacher teacher;
    private int [] marks;
    private int marksCount;
    private float avg;
    private int max;
    private int min;
    
    // Constructors
    public Student(){}
    
    public Student(String lname)
    {
        name = new Name(lname);
    }
    
    public Student(int maxMarks, String lname) 
    {
        name = new Name(lname);
        address = new Address();
        teacher = new Teacher();
        marks = new int[maxMarks];
        marksCount = 0;
        avg = 0;
        max = 0;
        min = 0;
    }
    
    //Setter & Getter
    public void setName(String fname, String mname, String lname) 
    {
        name.setFName(fname);
        name.setMName(mname);
        name.setLName(lname);
    }
    
    public Name getName() {
        return name;
    }

    public String getStringName() {
        return name.getFullName();
    }

    public void setkp(String kp) {
        this.kp = kp;
    }

    public String getkp() {
        return kp;
    }

    public void setAddress(String line1, String line2, String postcode, String city, String state) {
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
    
    public void setSchoolName(String schoolName) 
    {
        this.schoolname = schoolname;
    }

    public String getSchoolName() 
    {
        return schoolname;
    }

    public void setTeacher(Teacher teacher) throws Exception 
    {
        this.teacher = teacher;
        teacher.getStudents().addStudent(this);
    }

    public Teacher getTeacher() 
    {
        return teacher;
    }

    public String getStringTeacher() 
    {
        return teacher.getStringName();
    }
    
    //Other
    public void addMark(int marks) throws Exception
    {
        if (marksCount >= marks.length) 
        {
            throw new Exception("Limit of marks exceeded.");
        }

        else if (marks < 0 || marks > 100) 
        {
            throw new Exception("Invalid mark.");
        }
        else 
        {
            marks[marksCount++] = marks;
        }
    }

    public void displayMarks() 
    {
        if (marksCount == 0) {
            System.out.println("No marks listed.\n");
        }

        else {
            System.out.println(name.getFName() + "'s marks: ");

            for (int i = 0; i < marksCount; i++) {
                System.out.print(marks[i] + " ");
            }

        }


    }

    public int getmarksCount() 
    {
        return marksCount;
    }

    public float calcAvg() 
    {
        int sum = 0;

        for (int i = 0; i < marksCount; i++) 
        {
            sum += marks[i];
        }

        avg = (float) sum / marksCount;

        return avg;
    }

    public int calcMin() 
    {
        for (int i = 0; i < marksCount; i++) 
        {
            if (i == 0) 
            {
                min = marks[i];
            }
            else if (marks[i] <= min)
            {
                min = marks[i];
            }
        }

        return min;
    }
    
    public int calcMax()
    {
        for (int i = 0; i < marksCount; i++) 
        {
            if (i == 0) 
            {
                max = marks[i];
            }
            else if (marks[i] >= max)
            {
                max = marks[i];
            }
        }

        return max;
    }

}