package Week5.Day2;

public class Regex {
    public static void main(String[] args) {
        String st="This\sis\sclass";
        System.out.println(st);

        String st1="this\tis\tclass";
        System.out.println(st1);

        String st2="This is line 1.\nThis is line 2";
        System.out.println(st2);

        String st3="this is \rclass";
        System.out.println(st3);

        String st4="girls \f rule \f name";
        System.out.println(st4);

        String st5="this\b\b is class";
        System.out.println(st5);

        String st6="\"Hello\"";
        System.out.println(st6);

        char a='\'';
        System.out.println(a);

        String st7="this is \\ divide";
        System.out.println(st7);

    }
}
