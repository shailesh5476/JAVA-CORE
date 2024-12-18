import java.util.*;
import mypackage.myPackageClass;
public class Main {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String a = myObj.nextLine();
        System.out.print("Enetr your Age : ");
        int b = myObj.nextInt();
        System.out.println("Your name : "+a+" And your Age : ");
        myPackageClass myObj1 = new myPackageClass();
        myObj1.myMethod();
    }
}