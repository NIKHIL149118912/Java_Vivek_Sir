import java.util.Scanner;
class MultiTable{

    static void tablePrint(int n)
    {
        for(int i=1;i<11;i++)
        {
            System.out.println(n+" * "+i+"= "+n*i);
        }
    }
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        int number;
        System.out.print("Enter Number to print its multiplication table:\t");
        number=obj.nextInt();
        tablePrint(number);
    }
}