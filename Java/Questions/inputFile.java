import java.util.Scanner;
import java.io.*;

class InputFile{

    public static void main(String[] args)
    {
        try{
            Scanner file=new Scanner("xyz.txt");
            while(file.hasNext())
            {
                System.out.print(file.nextLine());
            }
            file.close();
        }
        
        catch(FileNotFoundException e){
            System.out.println("File not found");
            e.printStackTrace();
        }
        catch(Exception e)
        {
            System.err.println("An unexpected error occurred: "+ e.getMessage());
            e.printStackTrace();
        }
        
    }
}