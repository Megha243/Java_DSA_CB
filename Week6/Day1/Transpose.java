package Week6.Day1;

public class Transpose {
    static void display(int [][]nums){
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[0].length;j++){
                System.out.print(nums[i][j]+"\t");
            }
            System.out.println();
        }

    }

    //for n X n matrix only
    // static void transpose(int [][]nums){
    //     int temp=0;
    //     for(int i=0;i<nums.length;i++){
    //         for(int j=i;j<nums[0].length;j++){ //**//
    //             temp=nums[i][j];
    //             nums[i][j]=nums[j][i];
    //             nums[j][i]=temp;
    //         }
    //     }       
    // }
    static void transpose(int [][]nums){
        int temp=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<=i;j++){ //**//
                temp=nums[i][j];
                nums[i][j]=nums[j][i];
                nums[j][i]=temp;
            }
        }       
    }

    public static void main(String[] args) {
        int [][]nums={{1,2,3},{4,5,6},{7,8,9}};
        display(nums);
        transpose(nums);
        System.out.println("TRANSPOSE");
        display(nums);

    }
}
