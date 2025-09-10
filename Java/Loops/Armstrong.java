import java.util.*;
import java.lang.Math;
class Armstrong{

    static boolean isArmstrong(int n)
    {
        int temp=n,sum=0,d;
        int noOfDigits=(int)Math.log10(n)+1;
        while(temp!=0)
        {
            d=temp%10;
            sum+=Math.pow(d,noOfDigits);
            temp/=10;
        }
        return sum==n;
    }

    public static void main(String[] args)
    {   
        List<Integer> list=new ArrayList<>();
        for(int i=1;i<=100000;i++)
        {
            if(isArmstrong(i))
            {
                list.add(i);
            }
        }
        Iterator<Integer> itr=list.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}