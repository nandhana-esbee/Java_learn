import java.util.*;
class main1{
    public static void main(String args[]){
        int fact=1,num,i;
        System.out.println("Enter a number:");
        Scanner in=new Scanner(System.in);
        num=in.nextInt();
        for(i=1;i<=num;i++){
	        fact=fact*i;
	    }
        System.out.println(fact);
}}