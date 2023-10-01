
import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'compareTriplets' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> c=new ArrayList<>(2);
       int acount=0,bcount=0;
        for(int i=0;i<3;i++)
        {
          if(a.get(i)>b.get(i))
            acount++;
          else if(a.get(i)<b.get(i))
            bcount++;  
          else 
          continue;         
        }
        c.add(0,acount);
        c.add(1,bcount);
        return c;
    }

}

public class triplets {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result =Result.compareTriplets(a, b);

       // bufferedWriter.write(result.stream().map(Object::toString).collect(joining(" "))+ "\n" );
        System.out.println(result);
        bufferedReader.close();
      //  bufferedWriter.close();
    }
}
