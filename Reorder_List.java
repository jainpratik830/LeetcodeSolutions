public class Reorder_List {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode reverse(ListNode head){

        ListNode a=head;
        ListNode b=head.next;
        a.next=null;
        while(b!=null){
            ListNode temp=b.next;
            b.next=a;
            a=b;
            b=temp;
        }

        return a;
    }

    public void reorderList(ListNode head) {
        if(head == null || head.next == null) return ;

        ListNode slow=head;
        ListNode fast=head;
        ListNode prev=head;
        while(fast!=null && fast.next!=null ){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;

        }

        prev.next=null;
        ListNode rev=reverse(slow);
        ListNode curr=head;
        while(curr!=null){
            ListNode a=curr.next;
            ListNode b = rev.next;
            curr.next=rev;
            if(a!=null){
                rev.next=a;
            }
            curr=a;
            rev=b;

        }

    }

}
