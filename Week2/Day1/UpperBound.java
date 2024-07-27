package Week2.Day1;

import java.util.Arrays;

public class UpperBound {
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
    public static void main(String[] args) {
        int []arr={1,5,5,3,8,7,7,7,9,6};

        Arrays.sort(arr); //combination of quick and merge sort and gives better time complexity
        //1,2,5,5,6,7,7,7,8,9
        //0 1 2 3 4 5 6 7 8 9
        System.out.println(binarySearchUB(arr, 13));
        System.out.println(binarySearchUB(arr, 7));

    }
}
