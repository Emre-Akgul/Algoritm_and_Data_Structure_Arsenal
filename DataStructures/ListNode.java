public class ListNode {
    
    int val;
    ListNode next;

    ListNode(){

    }

    ListNode(int val){
        this.val = val;
        next = null;
    }

    ListNode(ListNode next, int val){
        this.next = next;
        this.val = val;
    }
}
