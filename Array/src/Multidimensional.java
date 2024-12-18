public class Multidimensional {
    public static void main(String[] args){
        int[][] my = {{10,20,30,40,50,60,70,80,90,100},{1,2,3,4,5,6,7,8,9,10}};
        System.out.println(my[0][5]);
        my[0][4]=100;
        System.out.println(my[0][4]);
        for(int i = 0;i<my.length;i++){
            for(int j = 0;j<my[i].length;++j){
                System.out.println(my[i][j]);
            }
        }
    }
}
