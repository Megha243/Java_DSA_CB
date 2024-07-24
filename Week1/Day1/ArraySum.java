package Week1.Day1;

public class ArraySum {

    static void printArr(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
    //function used to swap two elements inside an array
    static void swap(int[] arr,int i,int j){
        int temp;
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void reverseUsingSwap(int[] arr){
        for(int i=0,j=arr.length-1;i<j;i++,j--){
            swap(arr, i, j);
        }
    }
    static void reverseUsingSwapRange(int[] arr,int a,int b){
        for(int i=a,j=b;i<j;i++,j--){
            swap(arr, i, j);
        }
    }
    static int sum(int []arr){
        int sum=0;
        for(int i: arr){
            sum+=i;
        }
        return sum;
    }
    static int sumrange(int []arr,int a,int b){
        int sum=0;
        if(a>b || a<0 || b<0 || b>arr.length){
            return 0;
        }
        for(int i=a;i<=b;i++){
            // sum=sum+arr[i];
            sum+=arr[i];
        }
        return sum;
    }

    //---IMPORTANT----
    static void reverse1(int[] arr){
        int []temp=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            temp[i]=arr[arr.length-1-i];
       }
    //    arr=temp; //shallow copy //it won't work //garbage collector

    //Deep copy
        for(int i=0;i<arr.length;i++){
            arr[i]=temp[i];
        }
    } 


    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6};

        // System.out.println("sum is: "+sum(arr));

        // System.out.println("Reversing the elements");
        // for(int i=arr.length-1;i>=0;i--){
        //     System.out.print(arr[i]+" ");
        // }

        // System.out.println("sum in range is: "+sumrange(arr,1,3));
        // System.out.println("sum in range is: "+sumrange(arr,4,1));
        // System.out.println("sum in range is: "+sumrange(arr,4,4));

        // reverse1(arr);
        // reverseUsingSwap(arr);
        reverseUsingSwapRange(arr,1,4);
        printArr(arr);
    }
}
