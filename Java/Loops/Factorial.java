import java.util.Scanner;
class Factorial

{
    static int factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++)
        {
            fact*=i;
        }
        return fact;
    }

    static int fact_Recursion(int n)
    {
        if(n==0 || n==1)
        {
            return 1;
        }
        else return n*fact_Recursion(n-1);
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number to get its factorial\t");
        int number=sc.nextInt();
        System.out.println("Factorial by loops: "+factorial(number));
        System.out.print("Factorial by Recursion: "+ Factorial.fact_Recursion(number));//we can also use className before static members.
    }
    
}