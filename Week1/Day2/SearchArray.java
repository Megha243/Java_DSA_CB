package Week1.Day2;

public class SearchArray {
    static int linearSearch(int []arr,int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6};

        System.out.println(linearSearch(arr, 5));
        System.out.println(linearSearch(arr, 9));
    }
}
