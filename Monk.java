import java.util.ArrayList;
import java.util.Scanner;
class Monk{
    public static void main(String args[] ){
        Scanner sc=new Scanner(System.in);
        int T = sc.nextInt();
        int N=sc.nextInt();
        int K = sc.nextInt();
        sc.close();
        Eat obj=new Eat();
        int Z=K;
        if(T>=1 && T<=10){
            else if(N>=1 && N<=10e5){
                 else if(K>=0 && K<=10e5){
                    while(T!=0){
                    obj.sweet();

                     while(Z!=0){
                     obj.eats();
                     Z--;}
                     T--;
                }
            }
        }
    }
  }
}

class Sweets{
    ArrayList<Integer> A=new ArrayList<Integer>(N);
    Scanner sc=new Scanner(System.in);
    public void sweet(){
        for(int i=1;i<=N;i++){
            A.add(i,sc.nextInt());
        }
    }
}

class Eat extends Sweets{
    int count=0;
    public void eats(){
         int i=sc.nextInt();
         count = count+A.add(i);
         A.add(i,A(i)/2); 
        }
    }
    
