import java.io.*;

class Result {

    /*
     * Complete the 'pangrams' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String pangrams(String s) {
    // Write your code here
    int n=s.length();
    if(n>0 && n<=10e3){
       String str=s.toLowerCase();
       boolean[] alpha=new boolean[26];

        for(int i=0;i<n;i++)
        {
            char ch=str.charAt(i);
            if(ch>='a' && ch<='z')
            alpha[ch-'a']=true;
        }
        int count=0;
       for(boolean letter:alpha)
       {
        //System.out.println(letter);
         if(!letter)
         count++;
       }
       if(count!=0)
       return "not pangram";
       else
       return "pangram";
    }
    else{
    return "not pangram";
    }
    }
}

public class pangram {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();
        String result = Result.pangrams(s);
        System.out.println(result);
        bufferedReader.close();
    }
}
