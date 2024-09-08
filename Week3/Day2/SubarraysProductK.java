// Given an array of positive numbers, the task is to find the number of possible contiguous subarrays having a product less than a given number k.

// Input Format
// First line contains Integer where N is the Size of Array
// Second line contains Integer k
// Next N Line Contains an Integer which denotes element of array
package Week3.Day2;
import java.util.*;

public class SubarraysProductK {
        static int totalarrays(int []arr,int k){
            long product=1;
            int total=0,start=0;
            // i=end
            for(int i=0;i<arr.length;i++){
                    product*=arr[i];
                    while(product>=k && start<=i){
                        product/=arr[start];
                        start++;
    }
                    if(product<k){
                        total+=i-start+1;
                      //total++;
                    }
            }
            return total;
        }
        public static void main (String args[]) {
            Scanner sc=new Scanner(System.in);
            //no. of elemnets in array
            int N=sc.nextInt();
            //product should be less than k
            int k=sc.nextInt();
            int []arr=new int[N];
            for(int i=0;i<N;i++){
                arr[i]=sc.nextInt();
            }
            System.out.println(totalarrays(arr,k));
            sc.close();
        }
    
}
