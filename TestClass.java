import java.util.Scanner;
class TestClass
{
    static int count;

    public static int getCount(int count)
    {
        return count;
    }

    public static void fibonacci()
    {
        int first = 0;
        int second = 1;
        int third;
        int maxNum = count;

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
            for (int i = 2; i< maxNum; ++i)
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
        getCount(count);
        fibonacci();
    }  
}