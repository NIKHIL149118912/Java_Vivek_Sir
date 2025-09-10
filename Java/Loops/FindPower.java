import java.util.Scanner;
public class FindPower
{
    static int powerFinder(int base,int exp)
    {
        int result=1;
        for(int i=1;i<=exp;i++)
        {
            result*=base;
        }
        return result;
    }

    public static void main(String[] args)
    {
        System.out.print(powerFinder(3,4));
    }
}