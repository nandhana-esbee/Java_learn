import java.io.*;

class Result {

    public static int camelcase(String s) {
    int result=1;  
    for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(Character.isUpperCase(ch)){
            result++;
        }
    }
    return result;
    }

}

 public class camelcaseclass {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();
        int result = Result.camelcase(s);
        System.out.println(String.valueOf(result));
        bufferedReader.close();

    }
}
