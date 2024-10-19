package Week10.Day1;

public class MergeSort {
    static void merge(int []arr,int low,int mid,int high){
        int size=high-low+1;
        int []temp=new int[size];
        int i=mid;
        int j=high;
        int k=size-1;
        while (i>=low && j>=mid+1) {
            if(arr[i]>arr[j]){
                temp[k]=arr[i];
                i--;
            }
            else{
                temp[k]=arr[j];
                j--;
            }
            k--;
        }
        while (i>=low) {
            temp[k]=arr[i];
            i--;
            k--;
        }
        while (j>=mid+1) {
            temp[k]=arr[j];
            k--;
            j--;
        }
        for(i=low;i<=high;i++){
            arr[i]=temp[i-low];
        }
    }
    static void mergesort(int []arr,int low,int high){
        if(low<high){
            int mid=(high+low)/2;
            mergesort(arr, low, mid);
            mergesort(arr, mid+1, high);
            merge(arr,low,mid,high);
        }
    }
    public static void main(String[] args) {
        int []arr={3,5,7,1,4,2,6,8};
        int low=0;
        int high=arr.length-1;
        mergesort(arr, low,high);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
