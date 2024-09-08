package Week5.Day2;

public class SplitFunction {
    public static void main(String[] args) {
        String s1="Hi, this is example string.";
        // String []arr=s1.split("\\s");
        // String []arr=s1.split("\\s",0);
        // String []arr=s1.split("\\s",1); //breaks string in 1 part only
        String []arr=s1.split("\\s",2); //breaks string in 2 parts

        // String []arr=s1.split("i");
        for(String i:arr){
            System.out.println(i);
        }

        //STRING INTERN
        String st1="hello";
        String st2="hello";
        String st3=new String("hello").intern();
        System.out.println(st1==st3);

        //VALUE OF
        double n=876;
        String str=String.valueOf(n);
        // String str=n;
        str+="ab";
        System.out.println(str);
    }
}
