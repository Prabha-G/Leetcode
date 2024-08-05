/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode sp=new ListNode();
        ListNode res=sp;
        int total=0,count=0;
        while(l1!=null||l2!=null||count!=0){
            total=count;
            if(l1!=null){
            total=total+l1.val;
            l1=l1.next;
            }
            if(l2!=null)
            {
            total=total+l2.val;
            l2=l2.next;
            }
            int num=total%10;
            count=total/10;
            sp.next=new ListNode(num);
            sp=sp.next;

        }
        return res.next;



        
}
        
    }
