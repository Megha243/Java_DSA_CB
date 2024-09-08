package Week7.Day1;

import java.util.ArrayList;

public class Array_List_Sum {
    
    // static ArrayList<Integer> findSubArray(int []arr,int k){
    //     ArrayList<Integer> nums=new ArrayList<>();
    //     // for(int i=0;i<arr.length;i++){
    //     //     nums.add(arr[i]);
    //     // }
    //     int max_sum=Integer.MIN_VALUE;
    //     int currSum=0;
    //     for(int i=0;i<arr.length;i++){
    //         for(int j=1;j<arr.length;j++){
    //             currSum=arr[i]+arr[j];
    //             max_sum=Math.max(max_sum,currSum);
    //             if(currSum>max_sum){
    //                 nums.add(arr[i]);
    //                 nums.add(arr[j]);
    //             }
    //         }
    //     }
    //     return nums;
    // }

    //Sliding Window
    //a function to find the maximum sum subarray of size k

    static ArrayList<Integer> findSubArray(int []arr,int k){
        int start=0;
        int end=k-1;
        int max_sum=0;
        for(int i=0;i<=end;i++){
            max_sum+=arr[i];
        }
        int currSum=max_sum;
        int index=0;
        while(end<arr.length-1){
            currSum-=arr[start];
            start++;
            end++;
            currSum+=arr[end];
            if(max_sum<currSum){
                index=start;
                max_sum=currSum;
            }
        }

        ArrayList<Integer> nums=new ArrayList<>();
        for(int i=index;i<index+k;i++){
            nums.add(arr[i]);
        }
        return nums;
    }
    public static void main(String[] args) {
        int []arr={30,30,30,10,20,10,1,40,40};
        System.out.println(findSubArray(arr, 3));
    }
}
