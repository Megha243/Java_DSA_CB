package Week8.Day2;

public class Classroom3 {
    public static void main(String[] args) {
        //Default
        Students2 s1=new Students2();
        s1.study();

        //Custom
        Students2 s2=new Students2(302,"Lakshya","CB_GP",18000,"Java");
        s2.study();
    }
}
