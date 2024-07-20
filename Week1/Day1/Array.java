package Week1.Day1;

public class Array {
    static void print(int []arr){
        // for(int i=0;i<arr.length;i++){
        //     System.out.println(arr[i]);
        // }
        //FOR EACH LOOP
        for(int i : arr){
            System.out.println(i);
        }

    }
    public static void main(String[] args) {
        int []arr1=new int[6];
        int []nums={1,2,3,4,5,6};
        // arr1=nums; //shallow Copy
        boolean []arr2=new boolean[6];
        char []arr3=new char[6]; //in this,values that we pass are going to work as ASCII Values
        double []arr4=new double[6];

        System.out.println(arr1);
        System.out.println(arr2); //address of arrays are printed
        System.out.println(arr3); //nothing is printed
        System.out.println(arr4);

        System.err.println(arr1[0]);
        arr1[0]=4;
        System.err.println(arr1[0]);

        int []newarr=new int[6];
        for(int i=0;i<newarr.length;i++){
            newarr[i]=i+1;
        }
        System.out.println("new Array printed");
        print(newarr);
    }
}
