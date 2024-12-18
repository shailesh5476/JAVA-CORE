class Main {
    public String myMethod(String a) {
        String b = "What do you do :" + a;
        return b;
    }

    public void myMethod1() {
        System.out.println("Hi hello my name is Shailesh Kumar Gupta");
    }
}
class MyName extends Main{
    public int sumNum(int a, int b){
        return a+b;
    }
    public static void main(String [] args){
        MyName myObj = new MyName();
        int sg = myObj.sumNum(5,10);
        String akg = myObj.myMethod("I am fine ");
        myObj.myMethod1();
        System.out.println(sg);
        System.out.println(akg);
    }
}