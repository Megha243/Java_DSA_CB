package Week1.Day1;

import java.util.Scanner;
import java.math.*;
public class Function {
    static void hey(){
        System.out.println("hey");
    }
    static void swap(int a,int b){
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println("with swapping");
        System.out.println("1."+a);
        System.out.println("2."+b);

    }

    static void number(int n){
        for(int i=1;i<=n;i++){
            System.out.println(i);
        }
    }

    static boolean prime(int a){
        if(a==1 || a==0){
            return false;
        }
        else if(a==2){
            return true;
        }
        for(int i=2;i<a/2;i++){
            if(a%i==0){
                return false;
            }
        }
        return true;
    }

    static int inverse(int a){
        int n=0;
        while(a>0){
             n=n*10+a%10;
             a=a/10;    // a/=10;
        }
        return n;
    }

    static int count(int a){
        int n=0;
        int y=0;
        while(a>0){
             n=n*10+a%10;
             a=a/10;    // a/=10;
             y++;
        }
        return y;
    }

   

    static boolean armstrong(int a){
        int d=count(a);
        int temp=a;
        int sum=0;
        while(a!=0){
            sum+=Math.pow(a%10,d);
            a/=10;
        }
        return (temp==sum);
    }

    public static void main(String[] args) {

        // hey();

        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter no. 1");
        // int x=sc.nextInt();
        // System.out.println("Enter no. 2");
        // int y=sc.nextInt();
        // System.out.println("without swapping");
        // System.out.println("1."+x);
        // System.out.println("2."+y);
        // swap(x,y);

        // System.out.println("----NATURAL NUMBER-----");
        // number(6);

        // System.out.println("CHECKING PRIME NUMBER");
        // System.out.println(prime(5));
        // System.out.println(prime(14));

        // System.out.println("------INVERSE NO.-----");
        // // System.out.println(inverse(00234)); //read documnetation
        // System.out.println(inverse(234));
        // // System.out.println(inverse(1540));

        // System.out.println("------COUNT NO.-----");
        // System.out.println(count(234));
        // System.out.println(count(2340));

        System.out.println("------CHECK ARMSTRONG NO.-----");
        System.out.println(armstrong(1));
        System.out.println(armstrong(153));
        System.out.println(armstrong(12));
    }
}
