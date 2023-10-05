import java.util.*;
public class hurdles {
	public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);
	    int n =sc.nextInt();
	    int k=sc.nextInt();
	    int maxi=0;
	    int[] arr = new int[n];
	    for(int i=0;i<n;i++){
	    arr[i]=sc.nextInt();
	    maxi=Math.max(maxi,arr[i]);
	    }
	    sc.close();
	    if(maxi<=k )
	    System.out.println("0");
	    else 
	    System.out.println(maxi-k);
	    
	    
}
}
