// JAVA Operator    logical operator
public class Main
{
    public static void main(String[] args)
    {
        int x = 10;
        System.out.println(x);
        int y = 20;
        System.out.println(y);
        System.out.println(x>y&&x<y);
        System.out.println(y>x&&x<y);
        System.out.println(x>y&&y<x);
        System.out.println(x>y||y<x);
        System.out.println(y>x||x<y);
        System.out.println(x>y||x<y);
        System.out.println(!(x>y&&x<y));
        System.out.println(!(y>x&&x<y));
        System.out.println(!(x>y&&y<x));
        System.out.println(!(x>y||y<x));
        System.out.println(!(y>x||x<y));
        System.out.println(!(x>y||x<y));
    }
}
