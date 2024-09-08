// Given two arrays of integers, arr1 and arr2, the task is to find the length of the longest contiguous subarray that appears in both arrays.

// Input Format
// First line contains length of Array 1
// Second line elements of first array
// Third line contains length of Array 2
// Fourth line contains elements of second array
// **** Some testcase are failing
package Week3.Day2;
import java.util.*;

public class MaxLengthRepeatedSubarray {
        static int maximum(int []arr1,int []arr2){
            int max=0;
            for(int i=0;i<arr1.length;i++){
                int c=0;
                int idx=0;
                 for(int j=0;j<arr2.length && idx<arr1.length;j++){
                    if(arr2[j]==arr1[idx]){
                        idx++;
                        c++;
                    }
                    else{
                        max=Math.max(c,max);
                        c=0;
                    }
                }
                max=Math.max(c,max);
            }
            for(int i=0;i<arr2.length;i++){
                int c=0;
                int idx=0;
                 for(int j=0;j<arr1.length && idx<arr2.length;j++){
                    if(arr1[j]==arr2[idx]){
                        idx++;
                        c++;
                    }
                    else{
                        max=Math.max(c,max);
                        c=0;
                    }
                }
                max=Math.max(c,max);
            }
            return max;
        }
        public static void main (String args[]) {
            Scanner sc=new Scanner(System.in);
            int N1=sc.nextInt();
            int []arr1=new int[N1];
            for(int i=0;i<N1;i++){
                arr1[i]=sc.nextInt();
            }
            int N2=sc.nextInt();
            int []arr2=new int[N2];
            for(int i=0;i<N2;i++){
                arr2[i]=sc.nextInt();
            }
    
            System.out.println(maximum(arr1,arr2));
            sc.close();
        }
    
}
