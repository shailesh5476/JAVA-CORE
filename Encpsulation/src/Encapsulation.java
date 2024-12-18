public class Encapsulation {
    public static void main(String [] args){
        Main myObj = new Main();
        myObj.setName("hdhf");
        System.out.println(myObj.getName());
        // System.out.println(myObj.Name); this condition show the error because Name variable is Private this only access the same class.

    }
}
