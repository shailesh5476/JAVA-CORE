import java.util.Scanner;
public class Main {
    private  String Name;
    public String getName(){
        return Name;
    }
    public void setName(String skg){
        this.Name= skg;
    }
    public static void main(String[] args) {
        Main myObj = new Main();
        Scanner myObj1 = new Scanner(System.in);
        System.out.print("Enter your Name : ");
        String sg = myObj1.nextLine();
        myObj.setName(sg);
        System.out.println(myObj.getName());
        System.out.println(myObj.Name);
    }
}