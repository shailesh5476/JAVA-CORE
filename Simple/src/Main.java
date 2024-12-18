public class Main  {
    public static void main(String[] args){
        int a = 1;
        int b = 5;
        while(a<11){
            System.out.println(b+"X"+a +"="+a*b);
            a++;
        }
        int sg = 1;
        do{
            System.out.println(b+"X"+sg+"="+sg*b);
            ++sg;
        }
        while(sg<11);
        int c = 10;
        for(int i=1;i<=10;i++){
            System.out.println(c+"X"+i+"="+i*c);
        }
    }
}