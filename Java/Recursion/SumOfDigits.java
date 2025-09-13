class SumOfDigits
{
    static int sumDigit(int  n)
    {
        if(n<=0)
        {
            return 0;
        }
        int digit=n%10;
        return digit+sumDigit(n/10);
    }
    public static void main(String[] args)
    {
        System.out.print(sumDigit());
    }
}