package Week8.Day2;

public class Batch1 {
    String batch_name;
    int cost;
    String topic;
    // String s=new String();

    // Default Constructor
    public Batch1(){
        this.batch_name="default_batch";
        this.cost=95000;
        this.topic="java";
    }

    //custom constructor
    public Batch1(String batch_name,int cost,String topic){
        this.batch_name=batch_name;
        this.cost=cost;
        this.topic=topic;

    }
}
