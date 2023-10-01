import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;



public class hourglass{
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        
        int maxi=-100;
        for(int i=0;i<arr.size()-2;i++)
        {
            for(int j=0;j<arr.size()-2;j++)
            {
              int sum=arr.get(i).get(j)+arr.get(i).get(j+1)+arr.get(i).get(j+2)+arr.get(i+1).get(j+1)+arr.get(i+2).get(j)+arr.get(i+2).get(j+1)+arr.get(i+2).get(j+2);

              System.out.println(arr.get(i).get(j)+" "+arr.get(i).get(j+1)+" "+arr.get(i).get(j+2)+"\n\t"+arr.get(i+1).get(j+1)+"\n"+
              arr.get(i+2).get(j)+" "+arr.get(i+2).get(j+1)+" "+arr.get(i+2).get(j+2)+"\n"+sum+"\n\n");

              maxi=Math.max(maxi,sum);   
            }
        }
        System.out.print(maxi);
       
    }
}
