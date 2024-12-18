public class Main {
    int a = 5;
    int b;
    int c = 10;
    int d = a+c;
    String F_name = "Shailesh";
    String M_name = "Kumar";
    String L_name = "Gupta";
    int Age = 18;
    public static void main(String[] args) {
        Main myObj = new Main();
        System.out.println(myObj.a);
        System.out.println(myObj.d);
        myObj.b=15;
        System.out.println(myObj.b);
        myObj.a=20;
        System.out.println(myObj.a);
        System.out.println(myObj.d);
        System.out.println("My name: " + myObj.F_name+" "+myObj.M_name + " "+myObj.L_name+" \nAnd your Age: "+myObj.Age);

    }
}