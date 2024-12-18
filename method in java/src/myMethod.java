import java.util.Scanner;
public class myMethod
{
    public static void myAddNumber(int x, int y){
        int b = x+y;
        System.out.println("Add the two number of value :"+b);
        int c = x*y;
        System.out.println("Multiply the two number of value :"+c);
    }
    public static void ageCondition(int a){
        if(a<18){
            System.out.println("You are not eligible for Voting process");
        }
        else{
            System.out.println("You are eligible for voting process");
        }
    }
    public static void ageAndName(String a, String b){
        System.out.println("Your name is "+a+"& Your age "+b);
    }
    public static int addNmuber(int a, int b){
        return a+b;
    }
    public static void myMethod(){
        System.out.println("Hello My name is \"Shailesh Kumar Gupta\"");
    }
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = myObj.nextInt();
        System.out.println("Enter the second number :");
        int b = myObj.nextInt();
        myAddNumber(a,b);
        myMethod();
        Scanner myObj1 = new Scanner(System.in);
        System.out.println("Enter the Your Name");
        String sg = myObj1.nextLine();
        System.out.println("Enter the your age");
        String sk = myObj1.nextLine();
        ageAndName(sg,sk);
        ageCondition(a);
        int skg = addNmuber(a,b);
        System.out.println(skg);
    }
}