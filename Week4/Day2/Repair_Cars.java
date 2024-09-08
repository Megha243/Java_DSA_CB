package Week4.Day2;
//MINIMUM TIME TO REPAIR CARS Q-2594
public class Repair_Cars {
        static boolean check(int []arr,long time,int cars){
            long count=0;
            for(int i=0;i<arr.length;i++){
                count+=Math.sqrt(time/arr[i]);
            }
            return count>=cars;
        }
        static long repairCars(int[] ranks, int cars) {
            long low=1;
            long high=Long.MAX_VALUE;
            long ans=1;
            while(low<=high){
                long mid=high-(high-low)/2;
                if(check(ranks,mid,cars)){
                    ans=mid;
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            return ans;
        }
        public static void main(String[] args) {
            int []arr={4,2,3,1};
            System.out.println(repairCars(arr, 10));
        }
}

