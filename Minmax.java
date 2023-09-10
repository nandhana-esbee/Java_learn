import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result{

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
    sortarr(arr);
    long min=0l,max=0l;
    for(Integer i : arr){
        min+=i;
    }
    max=min-arr.get(0);
    min=min-arr.get(arr.size()-1);
    System.out.print(min+" "+max);
    }

    public static void sortarr(List<Integer> arr){
        
        for(int i=0;i<arr.size()-1;i++){
            if(arr.get(i)>=1 && arr.get(i)<=10e9){
            for(int j=i+1;j<arr.size();j++){
              if(arr.get(i)>arr.get(j)){
                  arr.set(i,arr.get(i)+arr.get(j));
                  arr.set(j,arr.get(i)-arr.get(j));
                  arr.set(i,arr.get(i)-arr.get(j));
              }  
            }
        }
        }
    }
}

public class Minmax {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}
