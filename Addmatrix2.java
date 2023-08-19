import java.util.*;
public class Addmatrix2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows=sc.nextInt();
        System.out.println("Enter the number of columns:");
        int cols=sc.nextInt();
       int[][] add1=new int[rows][cols];
       int[][] add2=new int[rows][cols];
       int[][] sum1=new int[rows][cols];
       for(int i=0;i<rows;i++){
        for(int j=0;j<cols;j++){
            System.out.println("Enter a"+i+j);
            add1[i][j]=sc.nextInt();
        }
       }
       for(int i=0;i<rows;i++){
        for(int j=0;j<cols;j++){
            System.out.println("Enter b"+i+j);
            add2[i][j]=sc.nextInt();
        }
       }
       for(int i=0;i<rows;i++){
        for(int j=0;j<cols;j++){
            sum1[i][j]=add1[i][j]+add2[i][j];
            System.out.print("\t"+sum1[i][j]);
        }
        System.out.println("\n");
        }
    } 
    
}
