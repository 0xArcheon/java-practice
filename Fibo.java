import java.util.Scanner;
class Fibo
{
    static int count;

    public static int getCount(int count) //static method with a return type
    {
        return count;
    }

    public static void fibonacci() //static method without a return type to display fibonacci series 
    {
        int first = 0; //first number in fibonacci series
        int second = 1; //second number in fibonacci series
        int third; //third number in the fibonacci series
        int maxNum = count; //number of integers to be printed in the series

        if(count == 1)
        {
            System.out.println("Fibonacci Series: " +first);
        }
        else if(count == 2)
        {
            System.out.println("Fibonacci Series: " +first+ "\n" +second);
        }
        else if(count <= 0)
        {
            System.out.println("Invalid Input");
        }
        else
        {
            System.out.println("Fibonacci Series: " +first+ "\n" +second);
            for (int i = 2; i< maxNum; ++i) //for loop to determine next number in the fibonacci series
            {
                third = first + second;    
                System.out.println("\n" + third);    
                first = second;    
                second = third;       
            }
        }     
    }
    public static void main(String[] args) 
    {
        System.out.println("Please enter the number of integers in fibonacci series: ");
        Scanner s = new Scanner(System.in);
        count = s.nextInt();
        getCount(count); //calls getCount method with count as parameter
        fibonacci(); //calls user defined method fibonacci 
    }  
}