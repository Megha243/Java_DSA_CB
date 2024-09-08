package Week4.Day1;
// Binary Search On Search Space
public class BinarySearchSpace {
    static boolean check(int mid,int dist,int time){
        int speed=dist/time;
        // if(speed<=mid){
        //     return true;
        // }
        // return false;
        return speed<=mid;
        // int dist_travel=mid*time;
        // return (dist_travel>=dist);
    }

    static int space(int dist,int time){
        int lowSpeed=0;
        int highSpeed=200;
        int ans=-1;
        while(lowSpeed<=highSpeed){
            int midSpeed=(lowSpeed+highSpeed)/2;
            if(check(midSpeed,dist,time)){
                ans=midSpeed;
                highSpeed=midSpeed-1;
            }
            else{
                lowSpeed=midSpeed+1;
            }

        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println("Minimum Speed");
        System.out.println(space(50,2));
        System.out.println(space(1000,2));
    }
}
