public class TeacherBatch {

    //ATTRIBUTES
    private Teacher[] teacher;
    private int teacherCount;

    private int indexRef;

    //CONSTRUCTORS
    public TeacherBatch(int maxTeacher) 
    {
        teacher = new Teacher[maxTeacher];
        teacherCount = 0;
        indexRef = 0;
    }

    //METHODS
    public boolean findTeacher(String lname) 
    {
        for (int i = 0; i < teacherCount; i++) 
        {
            if (teacher[i].getName().getLName() == lname) 
            {
                indexRef = i;
                return true;
            }
        }

        return false;
    }

    public void addTeacher(Teacher teacher) throws Exception
    {
        if (teacherCount >= teacher.length) 
        {
            throw new Exception("Limit of teachers exceeded.");
        }

        else 
        {
            teacher[teacherCount++] = teacher;
        }
    }

    public void removeTeacher(String lname) throws Exception
    {
        if (findTeacher(lname) == true) 
        {
            for (int i = indexRef; i < teacherCount; i++) 
            {
                if (i + 1 >= teacher.length) 
                {
                    teacherCount--;
                    return;
                }
                else 
                {
                    teacher[i] = teacher[i + 1];
                }
            }
            teacherCount--;
        }
        else {
            throw new Exception("Teacher not found.");
        }
    }

    public void displayTeacher() 
    {
        if (teacherCount == 0) 
        {
            System.out.println("No teachers listed.\n");
        }

        else 
        {
            System.out.println("Teachers: ");

            for (int i = 0; i < teacherCount; i++) 
            {
                System.out.println(teacher[i].getName().getLName());
            }
        }
    }

    public int getTeacherCount() 
    {
        return teacherCount;
    }
}