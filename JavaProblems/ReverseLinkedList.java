// JavaProblems/ReverseLinkedList.java
class ListNode {
    int val;
    ListNode next;
    ListNode(int val){ this.val = val; }
}

public class ReverseLinkedList {
    public static ListNode reverseList(ListNode head){
        ListNode prev=null, curr=head;
        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }

    public static void printList(ListNode head){
        while(head!=null){
            System.out.print(head.val+" ");
            head=head.next;
        }
        System.out.println();
    }

    public static void main(String[] args){
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);
        head.next.next.next=new ListNode(4);
        head=reverseList(head);
        printList(head);
    }
}
