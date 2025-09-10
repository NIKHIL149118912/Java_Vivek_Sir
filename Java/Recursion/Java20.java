class Java20
{
    static void printJava(int n,int k)
    {
        if(k>n)
        return;
        System.out.println("java");
        printJava(n-1,k);
    }
    public static void main(String [] args)
    {
        printJava(20,1);
    }
}
