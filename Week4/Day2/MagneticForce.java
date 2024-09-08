package Week4.Day2;             // Q-1552
// import java.lang.Math;
import java.util.Arrays;

public class MagneticForce {
        static boolean checkMax(int []arr,int force,int balls){
            int count=1;
            int lastPos=arr[0];
            for(int i=1;i<arr.length;i++){
                if(arr[i]-lastPos>=force){
                    lastPos=arr[i];
                    System.out.println(lastPos);
                    count++;
                }
            }
            return count>=balls;
        }
        static int maxDistance(int[] position, int m) {
            Arrays.sort(position);
            int low=1; //**
            // int high=(int)Math.pow(10,9);
            int high=position[position.length-1]-position[0];
            int ans=1;
            while(low<=high){
                int mid=high-(high-low)/2;
                if(checkMax(position,mid,m)){
                    ans=mid;
                    low=mid+1;
                    System.out.println("low");
                }
                else{
                    high=mid-1;
                    System.out.println("high");
                }
            }
            return ans;
        }
        public static void main(String[] args) {
            int []arr={1,2,3,4,7};
            System.out.println(maxDistance(arr, 3));
        }
}

