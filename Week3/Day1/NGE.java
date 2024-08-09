package Week3.Day1;
//next great elemnent
public class NGE {
//next great elemnent to right
    static int[] nger(int []arr){
        int maxElem=0;
        int []nger=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            nger[i]=maxElem;
            maxElem=Math.max(arr[i],maxElem);
        }
        return nger;
    }
//next great elemnent to left
    static int[] ngel(int []arr){
        int maxElem=0;
        int []ngel=new int[arr.length];
        for(int i=0;i<=arr.length-1;i++){
            ngel[i]=maxElem;
            maxElem=Math.max(arr[i],maxElem);
        }
        return ngel;
    }
    public static void main(String[] args) {
        int []arr={7,1,5,3,6,4};
        int []ngeRight=nger(arr);
        System.out.println("Next Greatest Element from right");
        for(int i: ngeRight){
            System.out.print(i+" ");
        }
        System.out.println();
        int []arr1={3,7,2,5,8,4,9,1,6};
        int []ngeLeft=ngel(arr1);
        System.out.println("Next Greatest Element from left");
        for(int i: ngeLeft){
            System.out.print(i+" ");
        }

    }
}
