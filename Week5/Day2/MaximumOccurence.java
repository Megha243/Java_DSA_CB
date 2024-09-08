package Week5.Day2;

public class MaximumOccurence {
//MAXIMUM OCCURING ELEMENT IN A UNSORTED STRING
    static char maximumOccurence(String s){
        int []arr=new int[26];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;
        }
        int index=0;
        int maxOcc=0;
        for(int i=0;i<arr.length;i++){
            if(arr[index]<arr[i]){
                index=i;
            }
        }
        return (char)('a'+index);
    }

    public static void main(String[] args) {
        String s1="aabbbbbbcccccccddaaaaaa";
        System.out.println(maximumOccurence(s1));

    }
}
