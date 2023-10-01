import java.util.Scanner;

public class hello{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int I = scan.nextInt();

        // Write your code here.
        double d=scan.nextDouble();
        scan.nextLine();
        String s=scan.nextLine();
        scan.close();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + I);

        //printf
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            //Complete this line
            System.out.printf("%-14s %03d%n",s1,x);
        }
        sc.close();
        System.out.println("================================");
        //int a;
        checking obj=new checking();
        obj.hellomethod();
    }
}

class checking
{
boolean instance;
void hellomethod()
{
    instance=true;
    System.out.println(instance);
}

}
