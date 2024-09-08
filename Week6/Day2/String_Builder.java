package Week6.Day2;
public class String_Builder {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Hi");
        System.out.println(sb.capacity());

        StringBuilder sb1=new StringBuilder();
        System.out.println(sb1.capacity()); //default capacity

        StringBuilder sb2=new StringBuilder(10);
        sb2.append("Hello");
        sb2.append("Hey");
        // sb2.ensureCapacity(100); //must append next line w/o this
        sb2.ensureCapacity(8); //must append next line w/o this
        sb2.append("Bye"); //exceeding the exixting capacity
        System.out.println(sb2.capacity());
        System.out.println(sb2.length());
        System.out.println(sb2.substring(5));

        StringBuilder sb3=new StringBuilder(10);
        sb3.append("Hello");
        // sb3.insert(2,'y');
        // sb3.insert(2,"y");
        // sb3.insert(2,3);
        // sb3.insert(2,4.0);
        // sb3.delete(2, 4);

        // sb3.reverse();
        // sb3.replace(2, 4, "Replaced"); //upperbound
        sb3.replace(2, 5, "Replaced");
        // sb3.delete(2); //doesn't work as it needs both lower and upper bound
        System.out.println(sb3);

    }
}
