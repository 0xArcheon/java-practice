
public class StudentApp {
  public static void main(String[] args) {

    // call constructor of the Student class with appropriate parameters
    Student s1 = new Student("Kane", 22, 'A', "2001-02-19");
    Student s2 = new Student("Ben", 55, 'B', "2000-01-11");

    // call public methods/ accessors and print details
    // student details of student 1
    System.out.println("-----Student 1-----");
    System.out.println(s1.getStudentName());
    System.out.println(s1.getSection());
    System.out.println(s1.getRollNo());
    System.out.println(s1.studentDetails());

    // student details of student 2
    System.out.println("-----Student 2-----");
    System.out.println(s2.getStudentName());
    System.out.println(s2.getSection());
    System.out.println(s2.getRollNo());
    System.out.println(s2.studentDetails());

    //update some details of student s2 with a setter method-
    System.out.println("Student s2 roll before updating: "+ s2.getRollNo());
    s2.setRollNo(20); // set roll no to 20 using setter;
    System.out.println("Student s2 roll after updating: "+ s2.getRollNo());

  }
}
