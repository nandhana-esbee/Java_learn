import java.util.*;
class Factorial{
    public static void main(String args[]){
        int fact=1,num,i;
        System.out.println("Enter a number:");
        Scanner in=new Scanner(System.in);
        num=in.nextInt();
        in.close();
        for(i=1;i<=num;i++){
	        fact=fact*i;
	    }
        System.out.println(fact);
}}
