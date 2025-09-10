import java.util.Scanner;
class SumNatural{
    static int sum(int n)
    {   int sum=0;
        for(int i=1;i<=n;i++)
        {
            sum+=i;
        }
        return sum;
    }

    public static void main(String[] args)
    {
        int num;
        System.out.println("Enter the Number\t");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        System.out.print("The Sum of natural numbers upto "+num+" is "+sum(num));
    }
}