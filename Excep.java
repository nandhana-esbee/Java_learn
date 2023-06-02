
public class Excep{
    public static void main(String args[]){
        try{
        int divi=100/0;
        System.out.println(divi);
        }catch(ArithmeticException e){System.out.println(e);}
        finally{
        System.out.println("Rest of the program....This is a finally block");}
    }
    }