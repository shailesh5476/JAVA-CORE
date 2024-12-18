abstract  class Main{
    public String F_name = "Shailesh Kumar Gupta";
    public int age = 18;
    public abstract void shailesh();
}
class student extends Main{
    public int AgeYear = 2005;
    public void shailesh(){
        System.out.println("Hey Your Name :");
    }
}
class Shailesh{
    public static void main(String [] args){
        student myObj = new student();
        System.out.println("Your name : "+myObj.F_name+" And your Age :"+myObj.age);
        System.out.println("Your DOB Year :"+myObj.AgeYear);
        myObj.shailesh();
        System.out.println(myObj.F_name);

    }
}