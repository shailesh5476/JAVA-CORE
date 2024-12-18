//Create a program in multiple Data Types
public class Main
{
    public static void main (String[] args)
    {
        byte a = 100;
        short b = 32000;
        int c = 2000000;
        long d = 900000000000000000L;
        float e = 7897607.89f;
        double f = 989887987655787.8677d;
        boolean g = true;
        char h = 'B';
        String s = "hi hello :";
        char j = 65;
        int sk = h; //Widening Type casting
        int l = a; // Widening Type casting
        int m = b; // Widening Type casting
        short n = (short)c;//Narrowing Type casting
        int o = 67;
        char p = (char)o;  //Narrowing Type casting
        System.out.println(a + "\n" + b + "\n" + c + "\n" + d + "\n" + e +"\n" + f +"\n" + g +"\n" + h +"\n" + s +"\n" + j +"\n" + sk +"\n" + l +"\n" + m +"\n" + n +"\n" + o +"\n" + p);


		/* That's given output 100
		32000
		2000000
		9000000000000000000
		7897607.89
		989887987655787.8677
		true
		B
		hi hello :
		A
		66
		100
		32000
		20000
		67
		C  */
    }
}
