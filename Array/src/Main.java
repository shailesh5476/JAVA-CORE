public class Main {
    public static void main(String[] args) {
        String[] Fruit1 = {"Mango","Guava","Banana","Grapes","Coconut","Papaya","Apple","Watermelon","Dragon","Fig","PineApple","Orange","Kiwi","Strawberry","Date"};
        int[] shailesh = {1,2,3,4,5,67,8,90,33};
        int sk = Fruit1.length;
        for(int i = 0;i<sk;i++){
            System.out.println(Fruit1[i]);
        }
        System.out.println(Fruit1[1]);
        Fruit1[1]="Banana";
        int a = 0;
        while(a<Fruit1.length){
            System.out.println(Fruit1[a]);
            a++;
        }
        System.out.println(Fruit1[1]);
        for(int i:shailesh){
            System.out.println(i);
        }
    }
}