final class InheritanceusingfinalKeywoard {
    public void myMethod2(){
        System.out.println("Hi What's up Bro :");
    }
}
// class MyName extends InheritanceusingfinalKeywoard{ show the error Cannot inherit from final 'InheritanceusingfinalKeywoard'
 final class MyClass{
    public void myMethod4(){
        System.out.println("My name is Shailesh Kumar Gupta");
    }
    public static void main(String[] args){
        InheritanceusingfinalKeywoard myObj = new InheritanceusingfinalKeywoard();
        myObj.myMethod2();
        MyClass myObj1 = new MyClass();
        myObj1.myMethod4();
    }
}