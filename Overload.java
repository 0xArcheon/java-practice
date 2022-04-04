class Overload
{
    public static void main(String[] args) 
    {
        add("Hello", "World"); 
        add(7, 22);
    }
    public static void add(String a, String b) //method to perform concatenation when provided Strings as parameteres
    {
        System.out.println(a+b);
    }
    public static void add(int a, int b) //method to perform addition when provided integers as parameteres
    {
        System.out.println(a+b);
    }
}