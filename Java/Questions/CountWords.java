public class CountWords {
    
    static int countWrd(String s)
    {       s=s.trim();
            int count=0;
            if(s.length()!=0){
            for(int i=0;i<s.length();i++)
            {   
                if(s.charAt(i)==' ' && s.charAt(i+1)!=' ')
                count++;
            }
           return count+1;
            }
           
            
            
    }
    public static void main(String[] args) {
        System.out.println(countWrd(""));
    }
}
