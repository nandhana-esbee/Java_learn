import java.util.Arrays;
import java.util.Scanner;
public class EzAna 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in); 
        String word1=sc.nextLine(); 
        String word2=sc.nextLine();
        sc.close();
        boolean res=checking.checkAnagram(word1,word2);
        System.out.println(res);
    }
    
}
class checking
{
    public static boolean checkAnagram(String word1,String word2)
    {
        char[] arr=word1.toUpperCase().toCharArray();
        char[] arr2=word1.toUpperCase().toCharArray();
        Arrays.sort(arr);
        Arrays.sort(arr2);
        if(Arrays.equals(arr,arr2))
        return true;
        else
        return false;
    }
}
