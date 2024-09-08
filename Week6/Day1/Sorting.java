package Week6.Day1;

import java.util.Arrays;

public class Sorting {
    static void display(int [][]nums){
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[0].length;j++){
                System.out.print(nums[i][j]+"\t");
            }
            System.out.println();
        }
    }
//ROW WISE
    static void sortbyRows(int [][]nums){
        for(int i=0;i<nums.length;i++){
            Arrays.sort(nums[i]);
        }
    }
//COLUMN WISE
    static void sortbyColumns(int [][]nums){
            // Arrays.sort(nums);
            //using comparable function
            Arrays.sort(nums,(a,b)->Integer.compare(a[0], b[0]));
        
    }

//WHOLE ARRAY
    static void sortWholeArray(int [][]nums){
        int []arr=flaten(nums);
        Arrays.sort(arr);
        fillArray(nums,arr);
    }
    static int[] flaten(int [][]nums){
        int rows=nums.length;
        int column=nums[0].length;
        int[] arr=new int[rows*column];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[0].length;j++){
                arr[column*i+j]=nums[i][j];
            }
        }
        return arr;
    }
    static void fillArray(int [][]nums,int []arr){
        int rows=nums.length;
        int column=nums[0].length;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[0].length;j++){
               nums[i][j]= arr[column*i+j];
            }
        }
    }
    public static void main(String[] args) {
        int [][]nums={{1,4,3},{8,6,7},{2,5,9}};
        display(nums);

        // System.out.println("Sort by rows");
        // sortbyRows(nums);

        // System.out.println("Sort by columns");
        // sortbyColumns(nums);

        System.out.println("Whole Array");
        sortWholeArray(nums);
        display(nums);
    }
}
