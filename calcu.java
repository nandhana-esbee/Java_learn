import java.util.*;
class calcu{
    public static void main(String args[]){
        Arithmetic2 obj=new Arithmetic2();
        obj.option();

    }}

    class Arithmetic{
        int num1,num2;
        public void inpu(){
        System.out.println("Enter two numbers:");
        Scanner sc=new Scanner(System.in);
           num1=sc.nextInt();
           num2=sc.nextInt();
           }
        public void add(){
            System.out.println("\nValue:"+(num1+num2)+"\n");
        }
        public void sub(){
            System.out.println("\nValue:"+(num1-num2)+"\n");
                }
        public void mul(){
            System.out.println("\nValue:"+(num1*num2)+"\n");
        }
        public void rem(){
            try{
                System.out.println("\nValue:"+(num1%num2)+"\n");
                }catch(ArithmeticException e){System.out.println(e);}
           
        }
        public void quot(){
            try{
                System.out.println("\nValue:"+(num1/num2)+"\n");
                }catch(ArithmeticException e){System.out.println(e);}
          
        }
    }

    class Arithmetic2 extends Arithmetic{
       int option;
       public void option(){
       System.out.println("Select an operation to perform:\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Quotient\n5.Remainder\n6.Exit");
       Scanner sc=new Scanner(System.in);
       option=sc.nextInt();
       switch(option){
        case 1:inpu();add();option();
        break;
        case 2:inpu();sub();
        break;
        case 3:inpu();mul();
        break;
        case 4:inpu();quot();
        break;
        case 5:inpu();rem();
        break;
        case 6:System.exit(0);
        default :System.out.println("Invalid option!!!");
       }}}


