import java.util.*;
public class space {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        sc.close();

        String newstr = "";
        for(int i = 0;i < str.length();i++) {
            char ch = str.charAt(i);
            if(ch != ' ') {
                newstr += ch;
        } 
        }
        System.out.println("\noutput: " + newstr);
    }
} 