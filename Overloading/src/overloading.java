public class overloading {
    public static int myNum(int a, int b){
        return a+b;
    }
    public static double myNum(float a,float b){
        return a+b;
    }
    public static double myNum(double a, double b){
        return a+b;
    }
    public static void main(String[] args) {
        int a = myNum(5,10);
        System.out.println(a);
        double b = myNum(5.5,5.6);
        double c = myNum(5.5,5.7);
        System.out.println(b);
        System.out.println(c);
    }
}