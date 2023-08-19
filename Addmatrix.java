public class Addmatrix {
    public static void main(String args[]){
       int[][] add1={{1,2},{3,4}};
       int[][] add2={{1,2},{3,4}};
       int[][] sum1=new int[2][2];
       for(int i=0;i<2;i++){
        for(int j=0;j<2;j++){
            sum1[i][j]=add1[i][j]+add2[i][j];
            System.out.print("\t"+sum1[i][j]);
        }
        System.out.println("\n");
       }
    } 
    
}

