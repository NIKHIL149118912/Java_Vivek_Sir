class CountDigit{
    static int digitCounter(int n,int count)
    {
        if(n==0)
        {
            return count;
        }
      return digitCounter(n/10, count + 1);
    }
    public static void main(String[] args) {
        System.out.println(digitCounter(5643,0));
    }
}