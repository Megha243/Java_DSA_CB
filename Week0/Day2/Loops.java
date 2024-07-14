package Week0.Day2;
import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // int i=1;
        // while(i<=10){
        //     System.out.println(i);
        //     i++;
        // }
        // System.out.println(":Do_while");
        // int a=9;
        // do{
        //     System.out.println(a);
        //     a++;
        // }
        // while(a<=10);
        System.out.println("For loop");
        System.out.println("Enter no.");
        int n=sc.nextInt();
            //simple loop
        // for(int i=0;i<n;i++){
        //     System.out.print("* ");
        // }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}


