package leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class CycleDetectionUsingSet {
    public ListNode detectCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        
        ListNode currentNode=head;
        
        while(currentNode!=null){
            if(!set.contains(currentNode)){
                set.add(currentNode);
            }
            else {
                return currentNode;
            }
            currentNode=currentNode.next;
        }
        return null;
    }
}