package Week3.Day2;
import java.util.Scanner;

// Given a binary array nums, you should delete one element from it.

// Return the size of the longest non-empty subarray containing only 1's in the resulting array. Return 0 if there is no such subarray.
public class DeleteOneElement {
//SLIDING WINDOW
    static int longestSubarrayWithOneDeletion(int[] nums) {
        int maxLength = 0;
        int zeroCount = 0;
        int left = 0;
        int n = nums.length;

        for (int right = 0; right < n; right++) {
            if (nums[right] == 0) {
                zeroCount++;
            }
            
            while (zeroCount > 1) {
                if (nums[left] == 0) {
                    zeroCount--;
                }
                left++;
            }

            // Calculate length of current window with at most one zero
            // Subtracting one because we need to delete one element
            maxLength = Math.max(maxLength, right - left);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read input values
        System.out.println("Enter total elemnts");
        int N = sc.nextInt();
        int[] nums = new int[N];
        System.out.println("Enter either 0 or 1 in array");
        for (int i = 0; i < N; i++) {
            nums[i] = sc.nextInt();
        }
        // 1,1,0,1,1,1,0,1
        // Calculate and print the length of the longest subarray containing only 1s after one deletion
        System.out.println(longestSubarrayWithOneDeletion(nums));

        sc.close();
    }


}
