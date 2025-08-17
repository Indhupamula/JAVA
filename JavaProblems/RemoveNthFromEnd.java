// JavaProblems/RemoveNthFromEnd.java
class ListNode4 {
    int val; ListNode4 next; ListNode4(int val){ this.val=val; }
}

public class RemoveNthFromEnd {
    public static ListNode4 removeNthFromEnd(ListNode4 head, int n){
        ListNode4 dummy=new ListNode4(0); dummy.next=head;
        ListNode4 first=dummy, second=dummy;
        for(int i=0;i<=n;i++) first=first.next;
        while(first!=null){ first=first.next; second=second.next; }
        second.next=second.next.next;
        return dummy.next;
    }

    public static void printList(ListNode4 head){
        while(head!=null){ System.out.print(head.val+" "); head=head.next; }
        System.out.println();
    }

    public static void main(String[] args){
        ListNode4 head=new ListNode4(1);
        head.next=new ListNode4(2);
        head.next.next=new ListNode4(3);
        head.next.next.next=new ListNode4(4);
        head.next.next.next.next=new ListNode4(5);
        head=removeNthFromEnd(head,2);
        printList(head);
    }
}
