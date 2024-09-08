package Week7.Day2;

public class Recursion {
    //Head Recursion
    static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n*factorial(n-1);
    }
    //Tail Recursion
    static int factorialTail(int n,int x){
        if(n==0 || n==1){
            return x;
        }
        return factorialTail(n-1,n*x);
    }   

    //Head Recursion
    static int power(int a,int b){
        if(b==0){
            return 1;
        }
        int x=a*power(a, b-1);
        return x;
    }
    //Tail Recursion
    static int powerTail(int a,int b,int x){
        if(b==0){
            return x;
        }
        return powerTail(a, b-1,a*x);
    }

    public static void main(String[] args) {
        int a=4;
        System.out.println("Factorial using Head Recursion");
        System.out.println(factorial(a));
        System.out.println(factorial(25));
        System.out.println(factorial(100));
        
        System.out.println("Factorial using Tail Recursion");
        System.out.println(factorialTail(a, 1));

        int b=2;
        System.out.println("Power using Head Recursion");
        System.out.println(power(a, b));
        System.out.println(power(2,3 ));

        System.out.println("Power using Tail Recursion");
        System.out.println(powerTail(a, b, 1));
    }
}
