public class Main {
    public void myMethod(){
        System.out.println("My name is Shailesh Kumar Gupta");
    }
    static void myMethod1(){
        System.out.println("My College Name Kanpur Institute of Technology");
    }
    public static void main(String[] args) {
        myMethod1();
        //myMethod(); create an object call the create your method otherwise you are not create class of object, this generates error is Compile error.
        Main myObj= new Main();
        myObj.myMethod();
    }
}