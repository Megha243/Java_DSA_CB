package Week2.Day1;

public class BubbleSort {
    static void bSort(int []arr){
        for(int turn=1;turn<arr.length;turn++){
            for(int i=0;i<arr.length-turn;i++){
                if(arr[i]>arr[i+1]){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }
    }
    static void display(int []arr){
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int []arr={5,4,7,9,2,8};
        bSort(arr);
        display(arr);

    }
}
