package Week8.Day1;

public class Valid_Parenthesis {
    static void generateParenthesis(int n,int l,int r,String ans){
        // int l=0;
        // int r=0;
        if(l==n && r==n){
            System.out.println(ans);
            return;
        }
        if(l<n){
            generateParenthesis(n, l+1, r, ans+"{");
        }
        if(l>r){
            generateParenthesis(n, l,r+1, ans+"}");
        } 
    }
    static int totalValid_Parenthesis(int n,int l,int r){
        if(l==n && r==n){
            return 1;
        }
        int a=0;
        int b=0;
        if(l<n){
            a=totalValid_Parenthesis(n, l+1, r);
        }
        if(l>r){
            b=totalValid_Parenthesis(n, l,r+1);
        }
        return a+b; 
    }
    public static void main(String[] args) {
        generateParenthesis(3, 0, 0, "");
        System.out.println(totalValid_Parenthesis(3,0,0));
    }
}
