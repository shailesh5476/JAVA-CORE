//String
public class Main
{
    public static void main(String[] args)
    {
        String list1 = "abcdefghijklmnopqrstuvwxyz";
        System.out.println(list1);
        int lengt = list1.length();
        System.out.println("The length of string is :"+lengt);
        String a = "Hello I am a engineering students :";
        System.out.println(a);
        String b = a.toUpperCase();
        System.out.println(b);
        String c = a.toLowerCase();
        System.out.println(c);
        String d = "Where are you doing ?";
        System.out.println(d);
        int e = d.indexOf("you");
        System.out.println(e);
        String F_name = "Shailesh ";
        String M_name = "Kumar ";
        String L_name = "Gupta";
        String Full_Name = F_name+M_name+L_name;
        System.out.println(Full_Name);
        System.out.println("Hello "+Full_Name);
        System.out.println(F_name.concat(L_name));

// Number & String

        int s = 10;
        System.out.println(s);
        int k = 20;
        System.out.println(k);
        int g = 30;
        System.out.println(g);
        int z = s+k+g;
        System.out.println(z);
        String x = "10";
        System.out.println(x);
        String y = "20";
        System.out.println(y);
        String t = x+y;
        System.out.println(t);
        String q = x+s;
        System.out.println(q);
        String my = "Hi hello my name is \"Shailesh Kumar Gupta\":";
        System.out.println(my);
        String know = "it's ok :";
        System.out.println(know);
    }
}