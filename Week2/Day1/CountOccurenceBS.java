package Week2.Day1;

import java.util.Arrays;

public class CountOccurenceBS {
    static int binarySearchLB(int []arr,int n){
        int i=0; //low
        int j=arr.length-1; //high
        int firstOcc=-1;
        while (i<=j) {
            int mid=(i+j)/2;
            if(arr[mid]==n){
                firstOcc=mid;
                j=mid-1;
            }
            else if(arr[mid]<n){
                i=mid+1;
            }
            else{
                j=mid-1;
            }
        }
        return firstOcc;
    }
    static int binarySearchUB(int []arr,int n){
        int i=0; //low
        int j=arr.length-1; //high
        int upperBou=-1;
        while (i<=j) {
            int mid=(i+j)/2;
            if(arr[mid]==n){
                upperBou=mid+1;
                i=mid+1;
            }
            else if(arr[mid]<n){
                i=mid+1;
            }
            else{
                j=mid-1;
            }
        }
        return upperBou;
    }

    static int count(int []arr,int n){
        int lb=binarySearchLB(arr, n);
        int ub=binarySearchUB(arr, n);
        if(lb==-1){
            return 0;
        }
        return ub-lb;
    }
    public static void main(String[] args) {
        int []arr={1,5,5,3,8,7,7,7,9,6};

        Arrays.sort(arr); //combination of quick and merge sort and gives better time complexity
        //1,2,5,5,6,7,7,7,8,9
        //0 1 2 3 4 5 6 7 8 9
        // int a=binarySearchLB(arr, 7);
        // int b=binarySearchUB(arr, 7);

        // int a=binarySearchLB(arr, 3);
        // int b=binarySearchUB(arr, 3);

        int a=binarySearchLB(arr, 13);
        int b=binarySearchUB(arr, 13);

        System.out.println(b-a); //UB-LB

        System.out.println("Using Function");
        System.out.println(count(arr, 10));
        System.out.println(count(arr, 5));
    }
}
