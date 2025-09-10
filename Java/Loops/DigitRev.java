import java.util.Scanner;
class DigitRev{

    static int reverse(int n)
    {
        int temp=n;
        int d,rev=0;
        while(temp>0)
        {
            d=temp%10;
            rev=rev*10+d;
            temp/=10;
        }
        return rev;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number to get its reverse Number");
        int number=sc.nextInt();
        System.out.println(reverse(number));        
    }
}