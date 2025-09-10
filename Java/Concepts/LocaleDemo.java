import java.util.*;

public class LocaleDemo {

    static void loadFiles(Locale locale)
    {
        ResourceBundle rb=ResourceBundle.getBundle("resource",locale);
    }

    static String getDataFromFile(String key){
        return rb.getString(key);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please press 1 for English");
        System.out.println("हिन्दी के लिए 2 दबांए");
        System.out.println("日本語のために3を押してください");
        int langChoice=sc.nextInt();

        Locale locale;
        if(langChoice==1)
        {
        locale =new Locale("EN","US");
        }

        else if(langChoice==2)
        {
            locale=new Locale("HI","IN");
        }
        else if(langChoice ==3)
        {
            locale=new Locale("JP","JA");
        }
        loadFiles(locale);
        System.out.println(getDataFromFile("ASK_NAME"));
    }
}
