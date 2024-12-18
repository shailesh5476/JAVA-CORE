class MyName{
    public static void myObj(){
        System.out.println("Hi my name is \"Shailesh Kumar GUpta\"");
    }
}
public class Main {
    protected int a = 10;
    protected int b = 10;
    protected int s = a+b;
    public static void main(String[] args) {
        MyName myObj1 = new MyName();
        myObj1.myObj();
        Main myObject = new Main();
        System.out.println(myObject.s);
        System.out.println(myObject.a);
        System.out.println(myObject.b);
        oops myObj2 = new oops();
        System.out.println("Your Name : "+myObj2.yourName());
    }
}