import java.util.Scanner;

public class Palindrome {
    public static void main(String args[]){
        int newnum=0;
        System.out.println("Enter a Number: ");
        Scanner nu=new Scanner(System.in);
        int num=nu.nextInt();
        int copynum=num;
        int count=0;
        do{
            count++;
            num=num/10;
        }while(num>0);
        System.out.println("The length of digit is "+count);
        num=copynum;
        if(count==1){
            System.out.println("The number is palindrome. "+num);  
        }
        else{
            while(num>0){
                newnum=(num%10)+newnum*10;
                num=num/10;
                
            }
            if(newnum==copynum){
                System.out.println("The number is palindrome. "+copynum+"="+newnum);
            }
            else{
                System.out.println("The number is not palindrome. "+copynum+"!="+newnum);
            }
        }
    }
    
}
