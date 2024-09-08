package Week8.Day1;

public class Subsequences {
    static void generateSubsq(String ques,String ans){
        if(ques.length()==0){
            System.out.println(ans);
            return;
        }
        //See its working tree
        generateSubsq(ques.substring(1),ans+ques.charAt(0));
        generateSubsq(ques.substring(1),ans);
    }
    static int countGenerateSubsq(String ques){
        if(ques.length()==0){
            return 1;
        }
        int l=countGenerateSubsq(ques.substring(1)); //include
        int r=countGenerateSubsq(ques.substring(1)); //exclude
        return l+r;
    }
    public static void main(String[] args) {
        generateSubsq("CAR", "");
        System.out.println(countGenerateSubsq("CAR"));
        System.out.println(countGenerateSubsq(""));
        System.out.println(countGenerateSubsq("C"));
    }
}
