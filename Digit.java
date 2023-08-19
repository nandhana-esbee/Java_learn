import java.util.Scanner;

public class Digit {
    public static void main(String args[]) {
        System.out.println("Enter a String:");
        Scanner inp=new Scanner(System.in);
        String str1=inp.nextLine();
        System.out.println(str1.length());
        System.out.println("Enter a digit:");
        int digit=inp.nextInt();
        inp.close();
        int count=0;
        do{
            count++;
            digit=digit/10;
        }while(digit>0);
        System.out.println("The length of digit is "+count);
    }
}
