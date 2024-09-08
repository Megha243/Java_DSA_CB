package Week5.Day2;

public class ReverseFunction {
    static void swap(String s,int i,int j){
        char temp;
        temp=s.charAt(i);
        //for this,to work we need to make an character array
        // s.charAt(i)=s.charAt(j);
        // s.charAt(j)=temp;
    }
    static void reverseUsingSwap(String s){
        for(int i=0,j=s.length()-1;i<j;i++,j--){
            swap(s, i, j);
        }
    }
    public static void main(String[] args) {
        String str="potato";
        for(int i=str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }

        String ne=new String();
        for(int i=str.length()-1;i>=0;i--){
            ne+=str.charAt(i);
        }
        System.out.println();
        System.out.println(ne);

    }
}
