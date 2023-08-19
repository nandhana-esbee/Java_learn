import java.util.*;
public class Ast_hash {
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter string containing # and * only");
       String str1=sc.nextLine();
       int counthash=0,countstar=0;
       //System.out.println(+x+"\t"+str1.charAt(1));
       for(int i=0;i<str1.length();i++){
        if(str1.charAt(i)=='#' || str1.charAt(i)=='*'){
            if(str1.charAt(i)=='#'){
                counthash++;
            }
            else{
                countstar++;
            }
        }
        else{
            System.out.println("Use only # and * ");
            System.exit(0);
        }
       }


       if(countstar>counthash){
        System.out.println((countstar-counthash)+ " no.of # is needed!!");
         }
       else if(counthash>countstar){
        System.out.println((counthash-countstar)+ " no.of * is needed!!");
          }
       else{
        System.out.println( " Valid string");
         }
       
    }
}
