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

//pn-|
//   |
//head-> 1 -> 2 -> 3 -> 4 ->5
//       |    |
//cn-----|    |
//nn----------|

class ListNode{
    int value;
    ListNode next;
}

class ReverseList {
    public ListNode reverseList(ListNode head) {
        ListNode currentNode= head;
        ListNode previousNode=null;
        while(currentNode!=null){
            ListNode nextNode = currentNode.next;
            currentNode.next=previousNode;
            previousNode=currentNode;
            currentNode=nextNode;
        }
        return previousNode;
    }
}