package Week2.Day2;
import java.util.Arrays;

public class InsertionSort {
    static void display(int []arr){
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    static void insertionSo(int []arr){
        for(int i=1;i<arr.length;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                --j;
            }
            arr[j+1]=key;
        }
    }
    public static void main(String[] args) {
        int []arr={4,2,7,8,3,1,6};
        // insertionSo(arr);
        Arrays.sort(arr);
        System.out.println(Arrays.binarySearch(arr, 3));
        display(arr);

    }
}
