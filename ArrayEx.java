class ArrayEx
{
    public static void main(String[] args) 
    {
       int i;
       int a[] = {1,3,5,7,9};
       System.out.println("Displaying array elements using regular for loop: ");
       //regular for loop
       for(i=0; i<a.length; i++)
       {
           System.out.print(a[i]+"\t");
       }
       System.out.println("\nDisplaying array elements using enhanced for loop: ");
       //enhanced for loop
       for(int j: a)
       {
           System.out.print(j+ "\t");
       }
    }
}