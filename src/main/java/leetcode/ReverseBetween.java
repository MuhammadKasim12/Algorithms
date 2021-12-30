package leetcode;

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

class ReverseBetween {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode currentNode= head;
        ListNode startNode=head;
        int i=1;
        while(i<left){
            startNode=currentNode;
            currentNode = currentNode.next;
            i++;
        }
        ListNode newList=null, tail=currentNode;
        while(i>=left && i<=right){
            ListNode nextNode = currentNode.next;
            currentNode.next=newList;
            newList=currentNode;
            currentNode=nextNode;
            i++;
        }
        startNode.next=newList;
        tail.next=currentNode;
        
        if(left>1){
            return head;
        }
        else {
            return newList;    
        }
    }
}