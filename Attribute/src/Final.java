public class Final {
    int a = 5;
    final int b =10;
    public static void main(String[] args){
        Final myObj = new Final();
        System.out.println(myObj.a);
        myObj.a = 20;
        System.out.println(myObj.a);
        System.out.println(myObj.b);
        //myObj.b = 30; this condition is not possible otherwise generate the syntax error.
        Final myObj1 = new Final();
        myObj1.a = 40;
        System.out.println(myObj.a);
        System.out.println(myObj1.a);
    }
}
