import java.util.Scanner;
import java.lang.Math;

public class Vehicle {
    public static void main(String args[]){
        int Totvehicle,Totwheels,numfour,numtwo;
        Scanner veh=new Scanner(System.in);
        System.out.println("Enter the number of vehicles: ");
        Totvehicle=veh.nextInt();
        System.out.println("Enter the number of wheels: ");
        Totwheels=veh.nextInt();
        veh.close();
        numtwo=(Totwheels/2)-Totvehicle;
        numfour=Totvehicle-numtwo;
        System.out.println("Number of four wheelers="+Math.abs(numfour)+"\nNumber of two wheelers="+Math.abs(numtwo));
    }
}
