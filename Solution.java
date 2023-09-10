import java.util.*;

class Result {
    int count=1,max=0,maxval=0;

public void migratoryBirds() {

      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int[] arr1=new int[n];
      int[] arr=new int[n];
      for(int i=0;i<n;i++){
          arr[i]=sc.nextInt();
      }
    sc.close();
    arrsort obj1=new arrsort();
    obj1.sort(arr);

   /* for(int i=0;i<n;i++){
          System.out.println(arr[i]);
      }*/

        if(n>=5 && n<=2*10e5){
            for(int i=0;i<n-1;i++){
               for(int j=i+1;j<n;j++) {
                   if(arr[i]==arr[j]){
                       count++;
                   }
               }
              arr1[i]=count;
               count=1;
        }
        for(int i=0;i<n-1;i++){
            if(arr1[i]>max){
                max=arr1[i];
                maxval=arr[i];
            }
        }
            
         System.out.println(maxval);
    }

}
}

class arrsort{

    public void sort(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    arr[i]=arr[i]+arr[j];
                    arr[j]=arr[i]-arr[j];
                    arr[i]=arr[i]-arr[j];
                }
            }
        }
    }

}


public class Solution {
    public static void main(String args[]){
     Result obj=new Result();
        obj.migratoryBirds();
    }
}
