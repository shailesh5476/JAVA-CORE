class Main {
    public void myMethod(){
        System.out.println("My name is Shailesh Kumar Gupta");
    }
}
class MyClass extends Main{
    public void myMethod(){
        System.out.println("I am Engineering Student");
    }
}
class MyClass2 extends Main{
    public void myMethod(){
        System.out.println("Where ar you from? ");
    }
}
class poly{
    public static void main(String[] args ){
        Main myObj = new Main();
        Main myObj1 = new MyClass();
        Main myObj3 = new MyClass2();
        myObj.myMethod();
        myObj1.myMethod();
        myObj3.myMethod();
    }
}