import java.util.*;
class AllDivisors {
    static void divisors(int n) {
        List<Integer> list=new ArrayList<>();
        for(int i=1;i<=n;i++)
    {
        if(n%i==0)
        {
            list.add(i);
        }
    }
        Object[] arr=list.toArray();
        for( Object obj: arr)
        {
            System.out.print(obj+" ");
        }
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        divisors(n);
    }
}
