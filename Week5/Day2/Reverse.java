package Week5.Day2;

public class Reverse {
    static void reverse(String s){
        String []arr=s.split("\\s");
        String temp="";
        System.out.print("!");
        for(int i=arr.length-1;i>=0;i--){
            temp+=arr[i]+" ";
        }
        temp=temp.trim();
        System.out.print(temp);
        System.out.print("!");

        // for(int i=arr.length-1;i>=0;i--){
        //     System.out.print(arr[i]+" ");
        // }
    }
    public static void main(String[] args) {
        String s="the bird is flying";
        reverse(s);
    }
}
