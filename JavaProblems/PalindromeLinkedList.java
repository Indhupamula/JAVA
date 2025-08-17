// JavaProblems/PalindromeLinkedList.java
class ListNode5 { int val; ListNode5 next; ListNode5(int val){ this.val=val; } }

public class PalindromeLinkedList {
    public static boolean isPalindrome(ListNode5 head){
        ListNode5 slow=head, fast=head;
        while(fast!=null && fast.next!=null){ slow=slow.next; fast=fast.next.next; }
        ListNode5 prev=null, curr=slow;
        while(curr!=null){ ListNode5 next=curr.next; curr.next=prev; prev=curr; curr=next; }
        ListNode5 left=head, right=prev;
        while(right!=null){ if(left.val!=right.val) return false; left=left.next; right=right.next; }
        return true;
    }

    public static void main(String[] args){
        ListNode5 head=new ListNode5(1); head.next=new ListNode5(2); head.next.next=new ListNode5(2); head.next.next.next=new ListNode5(1);
        System.out.println("Is Palindrome: "+isPalindrome(head));
    }
}
