//if....else in JAVA

public class Main
{
    public static void main(String[] args)
    {
        int c = 10;
        int d = 5;
        if(c>=d)
        {
            System.out.println("C is grater than D :");
        }
        int a = 20;
        int b = 21;
        if(a>=b)
        {
            System.out.println("A is grater than B :");
        }
        else
        {
            System.out.println("A is less than B :");
        }
        int time = 22;
        if(time<10) {
            System.out.println("Good Morning!");
        }
		else if(time<18)
        {
            System.out.println("Good Day!");
        }
        else
        {
            System.out.println("Good Evening!");
        }



        //Shorthand Else If


        int time1 = 20;
        String result = (time1<18) ? "Good Day! " : "Good Evening! ";
        System.out.println(result);
    }
}