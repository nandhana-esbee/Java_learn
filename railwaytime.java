import java.io.*;
import java.util.Arrays;
class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
    // Write your code here
    String[] time=s.split(":",3);
    if(time[2].charAt(2)=='A' || time[2].charAt(2)=='a')
    { 
        //System.out.println(time[0]);
       if(time[0].equals("12"))
           time[0]="00";

    }
    else
    {
       if(time[0].equals("12"))
       {
           time[0]="12";
       }
       else
       {
           time[0]=String.valueOf(12+Integer.valueOf(time[0]));
       } 
    }
    time[2]=time[2].substring(0,2);
    return time[0]+":"+time[1]+":"+time[2];
    }

}

public class railwaytime {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);
        System.out.println(result);

       // bufferedWriter.write(result);
        //bufferedWriter.newLine();

        bufferedReader.close();
        //bufferedWriter.close();
    }
}
