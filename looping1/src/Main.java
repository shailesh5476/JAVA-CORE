public class Main {
    public static void main(String[] args) {
        for(int i = 0;i<=10;i++){
            System.out.println("Outer"+i);
            for(int a = 0;a<=10;a++){
                System.out.println("Inner"+a);
            }
        }

        // the next programm

        String[] a = {"Shailesh ","Kumar ","Gupta ","hi ","Hello ","Hey ","What's ","Bro \n" };
        for(String i:a){
            System.out.print(i);
        }
        for (int i=0;i<=10;i++){
            System.out.println(i);
            if(i==5){
                break;
            }
        }
        for (int i=0;i<=10;i++){
            System.out.println(i);
            if(i==5){
                break;
            }
        }
        for (int s = 0;s<4;s++){
            if (s==2){
                continue;
            }
            System.out.println(s);
        }
    }
}