package Week11.Day1.LinkedList;

public class LL_utiility {
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.addFirst(40);
        ll.addFirst(50);
        ll.addFirst(60);
        ll.addFirst(70);
        System.out.println(ll.head);
        System.out.println(ll.head.data);
        System.out.println(ll.tail.data);
        System.out.println("Display function");
        ll.display();
        ll.addLast(10);
        System.out.println("after adding at last");
        ll.display();
        System.out.println("Finding elem");
        ll.findElem(2);
        ll.addAtIndex(20, 2);
        System.out.println("after adding in between");
        ll.display();

        // removeing
        System.out.println(ll.removeFirst());
        System.out.println(ll.removeLast());
        System.out.println(ll.removeInBetween(2));
        System.out.println("After removing");
        ll.display();

        System.out.println("Getiing elements");
        System.out.println(ll.getFirst()+" "+ll.getLast()+" "+ll.inBetween(2));


    }

}
