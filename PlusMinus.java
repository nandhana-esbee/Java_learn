
import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {
    
    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */
    public static void plusMinus(List<Integer> arr) {
    float countp=0.000000f,countm=0.000000f,count=0.000000f;
    if(arr.size()>0 && arr.size()<=100){
           for(int j=0;j<arr.size();j++){
               if(arr.get(j)>=-100 && arr.get(j)<=100){
                if(arr.get(j)>0)
                countp++;
                else if(arr.get(j)<0)
                countm++;
                else 
                count++;  
               }
           } 
        
    }
System.out.format("%.6f",countp/arr.size());
System.out.format("\n%.6f",countm/arr.size());
System.out.format("\n%.6f",count/arr.size());


}}

public class PlusMinus {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        //int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
