package Week6.Day1;
// insertion
// display
// Sum of Array
// Linear Search
// Transpose

public class TwoDArray1 {
    //insertion of values
    static void populate(int [][]nums){
        int n=1;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                nums[i][j]=n;
                n++;
            }
        }
    }

    static void display(int [][]nums){
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[0].length;j++){
                System.out.print(nums[i][j]+"\t");
            }
            System.out.println();
        }

    }

    static int sumtwoD(int [][]nums){
        int sum=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[0].length;j++){
                sum+=nums[i][j];
            }
        }
        return sum;
    }
    static int[] LinearSearch(int [][]nums,int target){
        int []ans=new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[0].length;j++){
                if(target==nums[i][j]){
                    ans[0]=i;
                    ans[1]=j;
                    return ans;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int [][]nums=new int[3][4];
        populate(nums);
        display(nums);
        int sum=sumtwoD(nums);
        System.out.println("Sum:"+sum);

        //Linear Search
        int []LS=LinearSearch(nums, 3);
        for(int i=0;i<LS.length;i++){
            System.out.print(LS[i]+" ");
        }

    }
}
