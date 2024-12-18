public class Scope1 {
    public static void main(String [] args){
        {
            {
                {
                    {
                        int a = 100;
                        System .out.println(a);{
                            int b= 200;
                            System.out.println(b);
                    }
                    }
                }
            }
        }
    }
}
