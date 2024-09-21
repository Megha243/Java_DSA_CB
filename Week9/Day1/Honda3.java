package Week9.Day1;

public class Honda3 implements Bike3{
    public void start(){
        System.out.println("I am starting Honda");
    }
    public static void main(String[] args) {
        Honda3 h=new Honda3();
        // Bike3.start();
        h.start();
    }
}
