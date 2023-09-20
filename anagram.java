import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class anagram {
    public static void main(String args[])throws IOException{
        System.out.println("Enter original string :");
         BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
         String org = bufferedReader.readLine();
         System.out.println("Enter second string :");
         String sec = bufferedReader.readLine();
         bufferedReader.close();
         //Angra obj=new Angra();
         String result=Angra.checkAnagram(org,sec);
         System.out.println(result);
    }
    
}

class Angra{

    public static String checkAnagram(String org,String sec){
        int index=0;
        org=org.toLowerCase();
        sec=sec.toLowerCase();
        int len=org.length();
        char[] checker=org.toCharArray();

        if(len==sec.length())
        {
            for(int i=0;i<len;i++)
            {
                for(int j=0;j<len;j++)
                {
                    if(checker[j]==sec.charAt(i))
                    {
                      checker[j]='/';  
                    }
                }
            }
            for(char letter:checker)
            {
                if(letter!='/')
                {
                 index++;   
                }
            }
            if(index==0)
            return "Anagram";
            else
            return "Not Anagram";
        }
        else
        return "Not Anagram";
    }

} 