package Java.Concepts;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class printDemo {
    public static void main(String[] args) throws
    
        FileNotFoundException{
            System.setOut(new PrintStream("A:\\RDEC-JAVA-"));//change location of output
            System.out.println("java"); //default value of out is "null" and output is shown on console

            //There is only one function "print" in java used to print all types of data
            // all others are overloaded on it.

            
        }
    }
