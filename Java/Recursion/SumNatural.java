class SumNatural{
    static int naturalSum(int n)
    {
        if(n==0)
        {
            return 0;
        }
        else return n+naturalSum(n-1);
    }
    public static void main(String[] args) {
        System.out.println(naturalSum(100));
    }
}