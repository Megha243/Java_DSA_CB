package Week8.Day2;

public class Students2 {
    int roll;
    String name;
    //object of another class is created
    Batch1 enrolled_batch;

    // Default Constructor
    public Students2(){
        this.roll=101;
        this.name="megha";
        enrolled_batch=new Batch1();
    }

    // Custom Constructor
    public Students2(int roll_no,String full_name,String batch_name,int batch_cost,String batch_topic){
        this.roll=roll_no;
        this.name=full_name;

        //direct initialization
        enrolled_batch=new Batch1(batch_name,batch_cost,batch_topic);
        
        //indirect method(not working)
            //class         //attribute        
        // this.enrolled_batch.batch_name=batch_name;
        // this.enrolled_batch.cost=batch_cost;
        // this.enrolled_batch.topic=batch_topic;
    }
    // Function
    public void study(){
        System.out.println(this.name+" is studying");
    }

}
