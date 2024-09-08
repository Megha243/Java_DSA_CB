package Week3.Day1;

public class RotateArray {
        public static void rotate(int[] nums, int k) {
            k%=nums.length;
            int n=nums.length;
            reverse(nums,0,n-1);
            reverse(nums,0,k-1);
            reverse(nums,k,n-1);
        }
        public static void reverse(int []nums,int i,int j){
            while(i<j){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
                j--;
            }
        }
        public static void main(String[] args) {
            int []arr={2,3,4,5,6,7,9};
            rotate(arr, 3);
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
        }
}
    // class Solution {
    //     public void rotate(int[] nums, int k) {
    //         int n=nums.length;
    //         k%=n;
    //         int []temp=new int[nums.length];
    //         for(int i=0;i<n-k;i++){
    //             temp[i+k]=nums[i];
    //         }
    //         for(int j=0;j<k;j++){
    //             temp[j]=nums[n-k+j];
    //         }
    //         for(int i=0;i<n;i++){
    //             nums[i]=temp[i];
    //         }
    
    //     }
    
    // }
    
    
    // class Solution {
    //     public void rotate(int[] nums, int k) {
    //         k%=nums.length;
    //         for(int i=0;i<k;i++){
    //             rotateone(nums);
    //         }
    //     }
    //     public void rotateone(int[] nums) {
    //         int a=nums.length-1;
    //         int temp=nums[a];
    //         for(int j=nums.length-1;j>0;j--){
    //             nums[j]=nums[j-1];
    //         }
    //         nums[0]=temp;
    //     }
    
    // }

