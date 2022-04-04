// We require this module to calculate age from dob;
import java.time.*; 

public class Student {
  // attributes---
  private String studentName;
  private int rollNo;
  private char section;
  private String dob; // format: yyyy-mm-dd

  // constructor---
  Student(String _name, int _roll, char _sec, String _dob){
    studentName = _name;
    rollNo = _roll;
    section = _sec;
    dob = _dob;
  }

  // Accessors---

  // getters--
  public String getStudentName(){
    return studentName;
  }
  
  public int getRollNo(){
    return rollNo;
  }
  
  public char getSection(){
    return section;
  }

  // setters--
  public void setStudentName(String _name){
    studentName = _name;
  }
  
  public void setRollNo(int _roll){
    rollNo = _roll;
  }
  
  public void setSection(char _sec){
    section = _sec;
  }

  // public / interface methods---

  public String studentDetails(){
    // calling a private utility method to get age from dob;
    int age = calculateAge(dob);
    return 
      "Student name: " + studentName + "\n" + 
      "Roll No: " + rollNo + "\n" + 
      "Section: " + section + "\n" +
      "Age: " + age; 
  }

  // private / implementation method---
  // an utility method to calculate age
  private int calculateAge(String _dob){
    // Convert string input to date format
    LocalDate dateOfBirth = LocalDate.parse(_dob); 

    // Get todays date: yyyy-mm-dd
    LocalDate currDate = LocalDate.now(); 

   // Get the difference between the two dates
   Period period = Period.between(currDate, dateOfBirth); 

   // Isolate the number of years to get proper age format
   int currAge  = Math.abs(period.getYears()); 
   return currAge;
  }
}
