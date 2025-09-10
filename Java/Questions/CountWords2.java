import java.util.*;

public class CountWords2{

    public static void main(String[] args)
    {
        String name="";

        Scanner sc=new Scanner("Tanish is grom sec D");

        int wordCount=0;

        while(sc.hasNext())
        {
            wordCount++;
            sc.next();
        }
    }
}