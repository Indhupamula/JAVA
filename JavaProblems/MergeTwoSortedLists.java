// JavaProblems/MergeTwoSortedLists.java
class ListNode2 {
    int val;
    ListNode2 next;
    ListNode2(int val){ this.val = val; }
}

public class MergeTwoSortedLists {
    public static ListNode2 mergeTwoLists(ListNode2 l1, ListNode2 l2){
        ListNode2 dummy=new ListNode2(0), curr=dummy;
        while(l1!=null && l2!=null){
            if(l1.val<l2.val){ curr.next=l1; l1=l1.next; }
            else { curr.next=l2; l2=l2.next; }
            curr=curr.next;
        }
        curr.next=(l1!=null)?l1:l2;
        return dummy.next;
    }

    public static void printList(ListNode2 head){
        while(head!=null){ System.out.print(head.val+" "); head=head.next; }
        System.out.println();
    }

    public static void main(String[] args){
        ListNode2 l1=new ListNode2(1); l1.next=new ListNode2(3); l1.next.next=new ListNode2(5);
        ListNode2 l2=new ListNode2(2); l2.next=new ListNode2(4); l2.next.next=new ListNode2(6);
        ListNode2 merged=mergeTwoLists(l1,l2);
        printList(merged);
    }
}
