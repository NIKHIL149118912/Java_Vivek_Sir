import java.lang.Math;
import java.util.Scanner;
    class SwapNum{
      static  int swNum(int n){   
            int digits=(int)Math.log10(n)+1;
            int firstDigit=n/(int)Math.pow(10,digits-1);// 589/100 = 5
            int lastDigit=n%10; // 589%10 = 9
            int middle=(n%(int)Math.pow(10,digits-1))/10;// (589%100)/10= 8

            int result= lastDigit*(int)Math.pow(10,digits-1) + middle*10 + firstDigit;
            return result;
        }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number to be swapped");
        int n=sc.nextInt();
        sc.close();

        System.out.print(swNum(n));
    }
}

