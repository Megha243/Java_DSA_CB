package Week1.Day2;
import java.util.*;
public class BinarySearch {
    static boolean binarySearchRange(int []arr,int n,int a,int b){
        int i=a;
        int j=b;
        while (i<=j) {
            int mid=(i+j)/2;
            if(arr[mid]==n){
                System.out.println(mid);
                return true;
            }
            else if(arr[mid]<n){
                i=mid+1;
            }
            else{
                j=mid-1;
            }
        }
        return false;
    }
    static boolean binarySearch(int []arr,int n){
        int i=0; //low
        int j=arr.length-1; //high
        while (i<=j) {
            int mid=(i+j)/2;
            if(arr[mid]==n){
                System.out.println(mid);
                return true;
            }
            else if(arr[mid]<n){
                i=mid+1;
            }
            else{
                j=mid-1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int []arr={1,5,3,8,7,9,6};

        Arrays.sort(arr); //combination of quick and merge sort and gives better time complexity
        //1,2,5,6,7,8,9
        //0 1 2 3 4 5 6
        // System.out.println(binarySearch(arr, 9));
        System.out.println(binarySearchRange(arr, 1,2,5));
        System.out.println(binarySearchRange(arr, 8,2,5));
        System.out.println(binarySearchRange(arr, 3,2,5));
        System.out.println(binarySearchRange(arr, 7,2,5));
    }
}
