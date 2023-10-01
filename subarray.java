import java.util.*;

public class subarray {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] A=new int[n];
        int count=0;
        for(int i=0;i<n;i++)
             A[i]=sc.nextInt();
             
        sc.close();
        for(int i=0;i<n;i++)
        {
            int sum=0;
            for(int j=i;j<n;j++)
            {
             sum=sum+A[j]; 
             if(sum<0)
             count++;
            }
        }
        System.out.println(count);
    }
}
