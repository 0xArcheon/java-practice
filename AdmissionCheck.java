// Java Program to check admission eligibility by providing obtained marks in the entrance examination
class AdmissionCheck
{    public static void main(String[] args)
    {
    String Name = "Bob Ross"; //Stores the Name of the candidate in a String (non primitive) variable 
    int totalMarks = 400; //Stores the total marks in the Examination in an Integer variable, primitive data type
    int obtainedMarks = 200; //Stores the user obtained marks in an Integer variable, primitive data type
    int cutoffMarks = totalMarks*50/100; //Calculates 50 percent of total marks and stores in an int variable

    //control statements
    if(obtainedMarks >= cutoffMarks)
    {
        System.out.println("Congratulations " +Name+ ", you are eligible for admission.");
        getPercentile(obtainedMarks, totalMarks); //calling getpercentile method with given parameters
    }
    else
    {
        System.out.println("Sorry " +Name+ ", you do not meet the criteria for admission.");
        getPercentile(obtainedMarks, totalMarks); //calling getpercentile method with given parameters
    }
    }
    // Method to calculate percentage of obtained marks having two integer parameters
    public static void getPercentile(int x, int y)
    {
        float percentage = (x*100)/y;
        System.out.println("Percentage: " +percentage+ "%");
    }
    
}