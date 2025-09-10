import java.util.Scanner;
public class RotateNumber {
    public static int rotateNumber(int num, int k) {
        int digits = (int) Math.log10(num) + 1; // Count the number of digits
        k = k % digits; // Handle cases where k > digits
        if (k < 0) k += digits; // when k is negative

        int divisor = (int) Math.pow(10, k); // Divisor for splitting the number
        int multiplier=(int)Math.pow(10,digits-k);
        int leftPart = num / divisor; // Left part of the number
        int rightPart = num % divisor; // Right part of the number

        return (rightPart * multiplier) + leftPart; // Combine rotated parts
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int num = sc.nextInt();
        System.out.print("By how many places you want to rotate it?");
        int k = sc.nextInt(); // Rotate by 2 places
        System.out.println("Rotated Number: " + rotateNumber(num, k));
    }
}
