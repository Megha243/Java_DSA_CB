package Week5.Day1;
public class Strings {
    public static void main(String[] args) {
        String s1="hello"; //memory is created in string pool
        String s2=new String("hello"); //memory is created in heap because of new keyword
        String s3=s1;
        String s4=new String(s1);
        char[] c={'h','e','l','l','o'}; //character array
        System.out.println(c);
        
        String a="R";
        String b="A";
        System.out.println(a.compareTo(b));

        String da="a"+"b"+"c";

        // String n=5+6+3+5; //gives error as it's a integer

        String n=5+6+"B"+"A"+3+5;
        // 5 and 6 are getting added and doing implicit conversion
        System.out.println(n);

        byte[] nd={70,71,23}; //works as ASCII value and do implicit conversion
        //implicit conversion works only when there is no lossy conversion
        
        // int[] nd={70,71,23}; //gives error

        String s=new String(nd);
        System.out.println(s);

    }
}
