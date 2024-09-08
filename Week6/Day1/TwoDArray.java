package Week6.Day1;

public class TwoDArray {
    public static void main(String[] args) {
        // int []arr=new int[4];
        // int [][]nums=new int[3][4];
        // System.out.println(arr);
        // System.out.println(nums);
        // System.out.println(nums[0]);
        // System.out.println(nums[1]);
        // System.out.println(nums[2]);
        // System.out.println(nums[0][1]);
//2-D Array
        int []arr={1,2,3};
        int [][]nums={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        System.out.println("Length of rows:"+nums.length);
        System.out.println("Length of column:"+nums[0].length);

        System.out.println(nums[0][1]);

//3-D Array
                         //     l b h
        int [][][]grid=new int[3][4][5]; //imagine cube or see register
        int [][][][][]grid1=new int[1][2][3][4][5];
        System.out.println(grid1);

    }
}
