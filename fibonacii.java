import java.util.Scanner;

public class fibonacii {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to check");
        int number=sc.nextInt();
        sc.close();
        System.out.println(checker.isFibonacci(number)?"True":"False");
    }
}

class checker
{
    public static boolean isPerfectSquare(int num)
    {
        int s=(int) Math.sqrt(num);
        return (s*s==num);
    }
    public static boolean isFibonacci(int num)
    {
        return isPerfectSquare(5*num*num+4) || isPerfectSquare(5*num*num-4);
    }
}