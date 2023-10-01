import java.util.Arrays;
import java.util.Collections;
public class forum {
    public static void main(String[] args) {
        Integer num[]={45,89,12,4,100,234,986,1,67};
        for(int number:num){
            if(number%2==0)
                System.out.println(number+" is even");
            else
                System.out.println(number+" is odd");
        }
        char ch='a';
        char ch1='c';
        System.out.println(ch1-ch); 

        for(int z:num)
        {
            System.out.println(z);
        }

        //using sort() and Collection.reverseOrder()
        Arrays.sort(num);
        System.out.println("Sorted array ->"+Arrays.toString(num));

        Arrays.sort(num,Collections.reverseOrder());
        System.out.println("Reversed array ->"+Arrays.toString(num));

        Arrays.sort(num,2,5);
        System.out.println("Sorted from index 1-5 ->"+Arrays.toString(num));


        //split
        String s="24:02:03PM";
        String[] hi=s.split(":",3);
        System.out.println(Arrays.toString(hi));
    }
}
