public class Demo {
    public static  double PI_VALUE = 3.14;
    public static void main(String[] args) {
        System.out.println("Hello ");
        displayNumber();
        Demo demo = new Demo();
        demo.showNumber();
        Sample sample = new Sample();
        sample.showDetails();
    }
//32 //8+ 12+8+4 = 32

    public  void showNumber(){
        double pi = 3.00;
        System.out.println(pi);
        displayNumber();
    }
    public static void displayNumber(){
        int x=5;
        System.out.println(x);
    }
}
