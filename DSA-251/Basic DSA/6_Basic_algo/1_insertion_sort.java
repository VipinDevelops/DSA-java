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
    public ListNode insertionSortList(ListNode head) {
        // Creating a dummy node for uses (swap, update )
        ListNode dummy = new ListNode(-1);

        // Current node (Latest New node )
        ListNode curr= head;

        // curr node will go throught each node so we can use a while loop to go through each element till end 
        while(curr != null ){
            // Store the next curr value so we can preserve it after swaping 
            ListNode temp = curr.next;
            ListNode prev = dummy; // store the prev to help the updating and checking current node for insertion 
            ListNode next = dummy.next; // store the next to help updating and checking current node for insertion 

            //Next will will keep moving to check for next node to insert in list 
            while(next!=null){
                if(next.val > curr.val){
                    break;
                }
                // Updating the pointers  we use to check
                prev = next;
                next = next.next;
            }

            // Now we need to add the new value in the linkedin list
            curr.next =  next;
            prev.next =  curr;
            curr = temp;
        }

        return dummy.next;

    }
}