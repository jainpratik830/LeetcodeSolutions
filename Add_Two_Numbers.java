public class Add_Two_Numbers {


    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int a,b,carry=0;
        ListNode x=new ListNode();
        ListNode head=new ListNode();
        ListNode node1=l1,node2=l2;

        a=node1.val;
        b=node2.val;
        ListNode node=new ListNode((a+b+carry)%10);
        carry=(a+b+carry)/10;
        head.next=node;
        x.next=node;
        node1=node1.next;
        node2=node2.next;
        while(node1!=null && node2 != null){
            x=x.next;

            // }
            a=node1.val;
            b=node2.val;
            node=new ListNode((a+b+carry)%10);
            carry=(a+b+carry)/10;
            x.next=node;
            node1=node1.next;
            node2=node2.next;
            // System.out.println(node.val);

        }

        while(node1!=null){
            x=x.next;
            a=node1.val;
            node=new ListNode((a+carry)%10);
            carry=(a+carry)/10;
            x.next=node;
            node1=node1.next;
        }
        while(node2!=null){
            x=x.next;
            a=node2.val;
            node=new ListNode((a+carry)%10);
            carry=(a+carry)/10;
            x.next=node;
            node2=node2.next;
        }
        if(carry!=0){
            x=x.next;
            node=new ListNode(carry);
            x.next=node;
        }

        return head.next;


    }

}
