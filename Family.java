
public class Family{
public static void main(String args[]){
Child obj=new Child();
obj.Display();

}
}
class Parent{
public void Display(){
System.out.println("I am parent.");
}
}
class Child extends Parent{
public void Display(){
System.out.println("I am child.");    
}
}
