package Week5.Day1;

public class Suffix {
        static int[] suffix(int []arr){
            int []s=new int[arr.length];
            for(int i=arr.length-1;i>=0;i--){
                if(i==arr.length){
                    s[i]=0;
                }
                else if(i==arr.length-1){
                    s[i]=arr[arr.length-1];
                }
                else{
                    s[i]=arr[i]+s[i+1];
                }
            }
            return s;
        }
    
    public static void main(String[] args) {
        int []nums={1,-1,4};
           int []suff=suffix(nums);
           for(int i=0;i<=suff.length-1;i++){
            System.out.print(suff[i]+" ");
           }
    }
    
}
