// JavaProblems/DetectCycleLinkedList.java
class ListNode3 {
    int val;
    ListNode3 next;
    ListNode3(int val){ this.val=val; }
}

public class DetectCycleLinkedList {
    public static boolean hasCycle(ListNode3 head){
        ListNode3 slow=head, fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast) return true;
        }
        return false;
    }

    public static void main(String[] args){
        ListNode3 head=new ListNode3(3);
        head.next=new ListNode3(2);
        head.next.next=new ListNode3(0);
        head.next.next.next=new ListNode3(-4);
        head.next.next.next.next=head.next; // cycle
        System.out.println("Has cycle: "+hasCycle(head));
    }
}
