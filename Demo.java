class Demo{
    static int pyr[][] = {{1,2},{3,4},{5,6}};
    public static void main(String[] args) {
        for(int i=0; i<6; i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.println(pyr[i][j]);
            }
            
        }
    }
}