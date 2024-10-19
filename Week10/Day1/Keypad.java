package Week10.Day1;

public class Keypad {
    static void keypress(String ques,String ans){
        String []arr={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        if(ques.length()==0){
            System.out.println(ans);
            return;
        }
        char ch=ques.charAt(0);
        String press=arr[ch-'0'];
        for(int i=0;i<press.length();i++){
            keypress(ques.substring(1), ans+press.charAt(i));
        }
    }
    public static void main(String[] args) {
        String a="245";
        keypress(a,"");
    }
}
