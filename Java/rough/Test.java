class Test{
    private static int one=55;
    int two=35;
    public static void main(String[] args) {
         Test obj=new Test();
         int today=22,two=42;
         System.out.println(today+obj.two+obj.one+two);//two is local and obj.two is global.
    }
}