import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {

    // criteria : if the difference between the grade and the next multiple of 5 is less than 3, round grade up to the next multiple of 5.
    // if the value of grade is less than 38, no rounding occurs as the result will still be a failing grade.

    public static List<Integer> gradingStudents(List<Integer> grades) {

    int n=grades.size();
    for(int i=0;i<n;i++)
    {
     if(grades.get(i)>=38)
     {
        double val=grades.get(i);
       double mul=Math.ceil(val/5)*5; 
       if((mul-grades.get(i))<3)
       {
           grades.set(i,(int)mul);
       }  
     }   
    }
    return grades;
    }

}

public class grade{
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int gradesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> grades = IntStream.range(0, gradesCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = Result.gradingStudents(grades);
        System.out.println(result);

        bufferedReader.close();
    }
}
