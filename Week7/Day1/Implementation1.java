package Week7.Day1;
// import Week6.Day2.String_Builder; //another folder

public class Implementation1 {
    public static void main(String[] args) {
        WrapperClass1 wc=new WrapperClass1(); //in same folder
        System.out.println(wc.num);

        Batch bh=new Batch(101,"Megha");
        System.out.println(bh.roll_number+" "+bh.name);

        Integer a1=10;
        Integer a2=100;
        Integer a3=999;
        Integer a4=10;

        Integer a5=999;

        System.out.println(a1+" "+a2+" "+a3);
        System.out.println(++a1+" "+ a2++ +" "+ ++a3);
        //will return true only till number 127 in case of a1==a2

        System.out.println(a1==10);
        // System.out.println(a1==a2);
        // System.out.println(a1==a4);

        // System.out.println(a3==a5);

        //unboxing
        Integer b1=10;
        int b2=b1;

        //Auto boxing
        int nums=2;
        Integer b3=nums;

        System.out.println(b1);
    }
}
