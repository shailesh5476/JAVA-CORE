public class Constructor1 {
    int a;
    String sg;
    public Constructor1(int b, String s){
        a = b;
        sg = s;
    }
    public static void main(String[] args){
        Constructor1 myObj = new Constructor1(18,"Shailesh Kumar Gupta");
        int d = myObj.a;
        String sk = myObj.sg;
        System.out.println("Your Name : "+sk+" & Your Age : "+d);
    }
}
