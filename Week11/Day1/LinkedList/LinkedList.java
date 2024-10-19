package Week11.Day1.LinkedList;

public class LinkedList {
    class Node{
        int data;
        Node next; //next address
    }
     Node head;
     Node tail;
    private int size;
    
    // TC=O(1)
    public void addFirst(int item){
        Node nn=new Node();
        nn.data=item;
        if(size==0){
            head=nn;
            tail=nn;
        }
        else{
            nn.next=head;
            head=nn;
        }        
        size++;
    }

    public void addLast(int item){
        if(size==0){
            addFirst(item);
        }
        else{
            Node nn=new Node();
            nn.data=item;
            tail.next=nn;
            tail=nn;
            size++; 
        }
    }

    public void addAtIndex(int item,int index ){
        if(index==0){
            addFirst(item);
        }
        else if(index==size-1){
            addLast(item);
        }
        else{
            Node nn=new Node();
            nn.data=item;

            Node K_1th=getNode(index-1);
            nn.next=K_1th.next;
            K_1th.next=nn;
            size++;
        }
    }

    public Node getNode(int index){
        Node temp=head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        return temp;
    }


    //GET
    public int getFirst(){
        return head.data;
    }
    public int getLast(){
        return tail.data;
    }
    //k=index
    public int inBetween(int k){
        if(k<0 || k>=size){
            return -1;
        }
        else if(k==0){
            return getFirst();
        }
        else if(k==size-1){
            return getLast();
        }
        else{
            return getNode(k).data;
        }
    }
    //finding element or an address of a particular node
    public void findElem(int k){
        Node temp=head;
        for(int i=0;i<k;i++){
            temp=temp.next;
        }
        System.out.println(temp);
        System.out.println(temp.data);
    } 


    //removing
    public int removeFirst(){
        int rv=head.data;
        if(size==1){
            head=null;
            tail=null;
        }
        else{
            Node temp=head;
            head=head.next;
            temp.next=null;
        }
        size--;

        return rv;
    }
    //remove Last
    public int removeLast(){
        if(size==1){
            return removeFirst();
        }
        else{
            int rv=tail.data;
            Node s1=getNode(size-2);
            s1.next=null;
            tail=s1;
            size--;
            return rv;
        }
    }
    public int removeInBetween(int k){
        if(k==0){
            return removeFirst();
        }
        else if(k==size-1){
            return removeLast();
        }
        else{
            Node k_1th=getNode(k-1);
            Node kth=k_1th.next;
            k_1th.next=kth.next;
            kth.next=null;
            size--;
            return kth.data;
        }
    }
    public void display(){
         Node temp=head;
         while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
         }
         System.out.println("Null");

    }

    public int size(){
        return size;
    }
}
