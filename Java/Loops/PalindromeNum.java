
import java.util.Scanner;
class PalindromeNum{

    static boolean isPalindrome(int n)
    {
        int temp=n;
        int d,rev=0;
        while(temp>0)
        {
            d=temp%10;
            rev=rev*10+d;
            temp/=10;
        }
        return rev==n;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number to get its reverse Number");
        int number=sc.nextInt();
        if(isPalindrome(number))
        {
            System.out.println("The Number "+number+" is Palindrome.");
        }
        else
        System.out.println("The number "+number+" is not Palindrome");        
    }
}