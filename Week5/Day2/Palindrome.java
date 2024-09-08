package Week5.Day2;

public class Palindrome {
    //checking palindrome
    static boolean check(String s1){
        int i=0;
        int j=s1.length()-1;
        while(i<=j){
            if(s1.charAt(i)!=s1.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;

    }
//MAXIMUM OCCURING ELEMENT IN A SORTED STRING
    static char maximumOccurence(String s){
        int countMaxElement=0;
        char maxElement='*';
        int countCurrElem=0;
        char currElement='*';
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=currElement){
                if(countCurrElem>countMaxElement){
                    countMaxElement=countCurrElem;
                    maxElement=currElement;
                }
                currElement=s.charAt(i);
                countCurrElem=1;
            }
            else{
                countCurrElem++;
            }
        }
        if(countCurrElem>countMaxElement){
            countMaxElement=countCurrElem;
            maxElement=currElement;
        }
        return maxElement;
    }
    public static void main(String[] args) {
        String s1="detartrated"; //longest palindrome
        System.out.println(check(s1));

        String s2="aabbbbbbcccccccdd";
        System.out.println(maximumOccurence(s2));
    }
}
