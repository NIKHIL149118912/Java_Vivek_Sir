import java.util.Scanner;
class SumOfDigit{

    static int SumDig(int n)
    {
        int sum=0,d;
        while(n>0)
        {
            d=n%10;
            sum+=d;
            n/=10;
        }
        return sum;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number to get its digits' sum:\t");
        int number=sc.nextInt();
        System.out.println(SumDig(number));        
    }
}