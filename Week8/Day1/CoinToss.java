package Week8.Day1;

public class CoinToss {

    static void coin(int n,String ans){
        if(n==0){
            System.err.println(ans); 
            return;       
        }
        coin(n-1, ans+"H");
        coin(n-1, ans+"T");
    }
    static int countSubsequnece(int n){
        if(n==0){
            return 0;       
        }
        else if(n==1){
            return 2;
        }
        int l=countSubsequnece(n-1);
        int r=countSubsequnece(n-1);
        return l+r;
    }
    public static void main(String[] args) {
        // coin(3, " ");
        System.out.println(countSubsequnece(3));
    }
}
