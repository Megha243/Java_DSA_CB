package Week8.Day1;

public class Fibonaaci_series {
    //Fibonaaci and Working Tree
    static int fibo(int n){
        if(n==1){
            return 0;
        }
        else if(n==2){
            return 1;
        }
        else{
            return fibo(n-1)+fibo(n-2);
        }
    }
    public static void main(String[] args) {
        int num=fibo(10);
        System.out.println(num);
    }
}
