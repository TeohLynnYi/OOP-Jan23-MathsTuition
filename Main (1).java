/*
Teoh Lynn Yi
21000417
COE
*/

public class Main
{
    // application code
	public static void main(String[] args) 
	{
        TuitionCenter tc1 = new TuitionCenter(100, 100);
        tc1.setHm(new Headmaster("Maxwell"));
        tc1.setTb(new TeacherBatch(100));
        tc1.setSb(new StudentBatch(100));

        Teacher azam = new Teacher(3, "Azam");
        Teacher barbara = new Teacher(3, "Barbara");
        Teacher chew = new Teacher(3, "Chew");
        
        Student mike = new Student(3, "Michael");
        Student adila = new Student(3, "Adila");
        Student imran = new Student(3, "Imran");

        try {
            tc1.getTb().addTeacher(azam);
            tc1.getTb().addTeacher(barbara);
            tc1.getTb().addTeacher(chew);

            tc1.getSb().addStudent(mike);
            mike.setTeacher(azam);
            mike.addMark(11);
            mike.addMark(88);
            mike.addMark(64);

            tc1.getSb().addStudent(adila);
            adila.setTeacher(azam);
            adila.addMark(45);
            adila.addMark(98);
            adila.addMark(77);

            tc1.getSb().addStudent(imran);
            imran.setTeacher(azam);
            imran.addMark(14);
            imran.addMark(81);
            imran.addMark(19);

            System.out.println("Headmaster     : " + tc1.getHm().getName().getLName());
            System.out.println("No. of Tutors  : " + tc1.getTb().getTeacherCount());
            System.out.println("No. of Students: " + tc1.getSb().getStudentCount() + "\n");

            tc1.getTb().displayTeacher();
            tc1.getSb().displayStudents();

            System.out.println("Teacher         : " + azam.getName().getLName());
            System.out.println("Average Scores: " + azam.getStudents().getAvg());

            System.out.println("Student       : " + mike.getName().getLName());
            System.out.println("Average Scores: " + mike.calcAvg());
            System.out.println("Highest Score : " + mike.calcMax());
            System.out.println("Lowest Score  : " + mike.calcMin() + "\n");

            System.out.println("Student       : " + adila.getName().getLName());
            System.out.println("Average Scores: " + adila.calcAvg());
            System.out.println("Highest Score : " + adila.calcMax());
            System.out.println("Lowest Score  : " + adila.calcMin() + "\n");

            System.out.println("Student       : " + imran.getName().getLName());
            System.out.println("Average Scores: " + imran.calcAvg());
            System.out.println("Highest Score : " + imran.calcMax());
            System.out.println("Lowest Score  : " + imran.calcMin() + "\n");

        } catch (Exception ex){
            ex.printStackTrace();
        }


    }
}
