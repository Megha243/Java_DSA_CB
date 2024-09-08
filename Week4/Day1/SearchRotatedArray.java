package Week4.Day1;
///SEARCH IN ROTATED SORTED ARRAY USING BINARY SEARCH IN O(log n) Time
//Q-33
public class SearchRotatedArray {
        public static int search(int[] nums, int target) {
            int low=0;
            int high=nums.length-1;
            while(low<=high){
                int mid=high-(high-low)/2;
                if(target==nums[mid]){
                    return mid;
                }
                else if(nums[mid]<=nums[high]){
                    if(target>nums[mid] && target<=nums[high]){
                        low=mid+1;
                    }
                    else{
                        high=mid-1;
                    }
                }
                else{
                    if(target>=nums[low] && target<nums[mid]){
                        high=mid-1;
                    }
                    else{
                        low=mid+1;
                    }
    
                }
            }
            return -1;
        }
        public static void main(String[] args) {
            int []arr={4,5,6,7,0,1,2};
            System.out.println(search(arr, 0));
        }
}
