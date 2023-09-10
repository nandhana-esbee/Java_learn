import java.util.Scanner;

public class playlist {
    public static void main(String args[]){
        inp out=new inp();
        out.input();
    }
    
}

class inp{
    int count=0,max=0;
    Scanner sc=new Scanner(System.in);
    public void input(){
    int n=sc.nextInt();
    int[] arr=new int[n];
    for (int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    sc.close();
     for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
                if(count>max)
                max++;
                else if(count==max)
                max++;
            }
            count=0;
        }
        System.out.println(max);
}

}

