import java.util.Scanner;
public class Bookpages{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of pages:\t");
        int n=sc.nextInt();
        System.out.println("Enter the page number:\t");
        int p=sc.nextInt();
        sc.close();
        System.out.println("Minimum pages turn:\t");
        Book obj=new Book();
        obj.pageCount(n,p);
    }
}
class Book extends track{
    public void pageCount(int n,int p){
        if(p>n/2){
            if(n%2!=0)
            backrow(n,p,0);
            else
            backrowodd(n,p);
        }
        else{
            System.out.print(p/2);
        }
    }
}
class track{
    public void backrow(int n,int p,int count){
        for(int i=n;i>0;i-=2){
            for(int j=i;j>=i-1;j--){
               ifloop(j,p,count);
            }
            count++;
        }
    }
    public void backrowodd(int n,int p){
        if(n==p)
        System.out.println("0");
        else
        backrow(n-1,p,1);
    }
    public void ifloop(int j,int p,int count){
        if(j==p){
            System.out.println(count);
        }
    }
}
