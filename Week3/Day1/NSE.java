package Week3.Day1;

public class NSE {
    static int[] nser(int []arr){
        int minElem=Integer.MAX_VALUE;
        int []nser=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            // nser[i]=minElem;
            if(minElem==Integer.MAX_VALUE){
                nser[i]=0;
            }
            else{
                nser[i]=minElem;                
            }
            minElem=Math.min(arr[i],minElem);
        }
        return nser;
    }
    static int[] nsel(int []arr){
        int minElem=Integer.MAX_VALUE;
        int []nsel=new int[arr.length];
        for(int i=0;i<=arr.length-1;i++){
            // nser[i]=minElem;
            if(minElem==Integer.MAX_VALUE){
                nsel[i]=0;
            }
            else{
                nsel[i]=minElem;                
            }
            minElem=Math.min(arr[i],minElem);
        }
        return nsel;
    }
    public static void main(String[] args) {
        int []arr1={3,7,2,5,8,4,9,1,6};
        int []nger=nser(arr1);
        System.out.println("Next Smallest Element from right");
        for(int i: nger){
            System.out.print(i+" ");
        }
        System.out.println();

        int []ngel=nsel(arr1);
        System.out.println("Next Smallest Element from left");
        for(int i: ngel){
            System.out.print(i+" ");
        }
    
    }
}
